package com.woniuxy.springboot.myspringboot04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.springboot.myspringboot04.entity.Emp;
import com.woniuxy.springboot.myspringboot04.mapper.EmpMapper;
import com.woniuxy.springboot.myspringboot04.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	EmpMapper empMapper;
	
	@Override
	public void addEmp(Emp emp) {

		empMapper.insertEmp(emp);
	}

	@Override
	public List<Emp> selectAllEmps() {
		
		return empMapper.selectEmps();
	}

	@Override
	public Emp selectEmpByEid(Integer eid) {
		return empMapper.selectEmpByEid(eid);
	}

	
	@Transactional
	@Override
	public void updateEmp(Emp emp) {
		//事务
		empMapper.delectEmp(emp.getEid());
		
		empMapper.insertEmp(emp);
	}

}
