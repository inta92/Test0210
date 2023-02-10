package com.maju.k.exam;

import java.util.List;

public interface ExamService {
	List<ExamVO> examSelectAll();
	void insert(ExamVO vo);
	void update(ExamVO vo);
	void delete(ExamVO vo);
}
