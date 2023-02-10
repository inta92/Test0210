package com.maju.k.member;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
	List<MemberVO> memberList();
	MemberVO login(MemberVO vo);
}
