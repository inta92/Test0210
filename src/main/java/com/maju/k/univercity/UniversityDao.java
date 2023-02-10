package com.maju.k.univercity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UniversityDao {
	List<UniversityVO> select();
	UniversityVO insert(UniversityVO vo);
	UniversityVO update(UniversityVO vo);
	UniversityVO delete(UniversityVO vo);
	UniversityVO edit(UniversityVO vo);
}
