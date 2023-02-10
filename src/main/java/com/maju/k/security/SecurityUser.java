package com.maju.k.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

import com.maju.k.member.MemberVO;

public class SecurityUser  extends User  {

	private static final long serialVersionUID = 1L;

	public SecurityUser( MemberVO vo	) {
		super( vo.getUsername() , vo.getPassword()
		      ,  AuthorityUtils.createAuthorityList(vo.getRole().toString()) );

		System.out.println("SecurityUser확인:" + vo.getUsername() + ":" + vo.getPassword());
	}

}
