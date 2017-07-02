package com.student.service;

import java.util.List;

import com.student.pojo.StGrade;


public interface GradeService {
	
	boolean addGrade(String numbers,String grades,long courseId);
	
	List<StGrade> getGradeList(String number,long courseId);
	
	List<StGrade> getGradeByNumber(String number);
	
	void deleteGradeByNumber(String number);
}
