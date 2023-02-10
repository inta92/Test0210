package com.maju.k.exam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceIpml implements ExamService{

	@Autowired
	ExamDao dao;
	
	@Override
	public List<ExamVO> examSelectAll() {
		return dao.examSelectAll();
	}

	@Override
	public void insert(ExamVO vo) {
		dao.insert(vo);
	}

	@Override
	public void update(ExamVO vo) {
		dao.update(vo);
	}

	@Override
	public void delete(ExamVO vo) {
		dao.delete(vo);
	}
	
	

}
