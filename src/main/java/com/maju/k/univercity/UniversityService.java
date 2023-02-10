package com.maju.k.univercity;

import java.util.List;

public interface UniversityService {
	List<UniversityVO> select();
	UniversityVO insert(UniversityVO vo);
	UniversityVO update(UniversityVO vo);
	UniversityVO delete(UniversityVO vo);
	UniversityVO edit(UniversityVO vo);
}
