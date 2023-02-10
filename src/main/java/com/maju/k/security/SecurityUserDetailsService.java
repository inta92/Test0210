package com.maju.k.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.maju.k.member.MemberServiceImpl;
import com.maju.k.member.MemberVO;

@Service
public class SecurityUserDetailsService implements  UserDetailsService {

	SecurityUserDetailsService(){
		System.out.println(" ====> SecurityUserDetailsService 생성자 확인 ");
	}
	
	@Autowired
	MemberServiceImpl  Service;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			                           throws UsernameNotFoundException {
	
		MemberVO vo =new MemberVO();
		vo.setUsername(username);
		
		MemberVO 	user = Service.login(vo);
		System.out.println("user확인:" + user);
		
		if (user == null) {
			throw new UsernameNotFoundException(username +" 사용자가 없습니다.");
			
		} else {
			System.out.println("===> new SecurityUser(user) 로 넘어간다.!! ");
			return  new SecurityUser(user) ;
		}
		
		
	}

}
