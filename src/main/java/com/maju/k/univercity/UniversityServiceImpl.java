package com.maju.k.univercity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService{

	@Autowired
	UniversityDao dao;
	
	@Override
	public List<UniversityVO> select() {
		return dao.select();
	}

	@Override
	public UniversityVO insert(UniversityVO vo) {
		return dao.insert(vo);
	}

	@Override
	public UniversityVO update(UniversityVO vo) {
		return dao.update(vo);
	}

	@Override
	public UniversityVO delete(UniversityVO vo) {
		return dao.delete(vo);
	}

	@Override
	public UniversityVO edit(UniversityVO vo) {
		return dao.edit(vo);
	}

}
