package com.maju.k.exam;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamDao {
	List<ExamVO> examSelectAll();
	void insert(ExamVO vo);
	void update(ExamVO vo);
	void delete(ExamVO vo);
}
