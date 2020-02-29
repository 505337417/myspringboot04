package com.woniuxy.springboot.myspringboot04.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woniuxy.springboot.myspringboot04.entity.Dep;
import com.woniuxy.springboot.myspringboot04.entity.Emp;
import com.woniuxy.springboot.myspringboot04.mapper.DepMapper;
import com.woniuxy.springboot.myspringboot04.mapper.EmpMapper;
import com.woniuxy.springboot.myspringboot04.service.DepService;
import com.woniuxy.springboot.myspringboot04.service.EmpService;

@Service
public class DepServiceImpl implements DepService{

	@Autowired
	DepMapper DepMapper;

	@Override
	public List<Dep> selectAllDep() {
		return DepMapper.selectAllDep();
	}
	


}
