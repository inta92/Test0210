package com.maju.k.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	SecurityConfig(){
		System.out.println("===> SecurityConfig 생성자 확인 ");
	}
	
	@Autowired
	SecurityUserDetailsService  securityUserDetail;

	@Override
	protected  void   configure(HttpSecurity  http) throws Exception {
		
		// 실행이 되지만 옛날 함수  
		
		http.authorizeRequests().antMatchers("/","/system/**").permitAll();
		http.authorizeRequests().antMatchers("/exam/**").authenticated();
		http.authorizeRequests().antMatchers("/manager/**").hasRole("MANAGER");
		http.authorizeRequests().antMatchers("/university/**").hasRole("ADMIN");
		
		http.csrf().disable();
		// 인증 받지 않은 상태에서는 권한없음이 아닌 로그인 페이지로 간다.
		http.formLogin().loginPage("/login.do").defaultSuccessUrl("/loginSuccess.do", true);
		http.exceptionHandling().accessDeniedPage("/accessDenied.do");
		http.logout().invalidateHttpSession(true).logoutSuccessUrl("/");		
		http.userDetailsService(securityUserDetail);
		
	}
	
	@Bean
	PasswordEncoder  passwordEncoder() {
		
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
		
	}	
	
}