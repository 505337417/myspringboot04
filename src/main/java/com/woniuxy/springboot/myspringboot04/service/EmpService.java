package com.woniuxy.springboot.myspringboot04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woniuxy.springboot.myspringboot04.entity.Emp;


public interface EmpService {

	void addEmp(Emp emp);
	List<Emp> selectAllEmps();
	Emp selectEmpByEid(Integer eid);
	void updateEmp(Emp emp);
}
