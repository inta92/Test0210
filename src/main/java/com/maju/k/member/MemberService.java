package com.maju.k.member;

import java.util.List;

public interface MemberService {
	List<MemberVO> memberList();
	MemberVO login(MemberVO vo);
}
