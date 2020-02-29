package com.woniuxy.springboot.myspringboot04;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.woniuxy.springboot.myspringboot04.entity.Dep;
import com.woniuxy.springboot.myspringboot04.entity.Emp;
import com.woniuxy.springboot.myspringboot04.entity.Stu;
import com.woniuxy.springboot.myspringboot04.mapper.DepMapper;
import com.woniuxy.springboot.myspringboot04.mapper.EmpMapper;
import com.woniuxy.springboot.myspringboot04.mapper.StuMapper;
import com.woniuxy.springboot.myspringboot04.service.DepService;
import com.woniuxy.springboot.myspringboot04.service.EmpService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Myspringboot04ApplicationTests {

	
	
	@Autowired
	EmpMapper empMapper;
	
	@Autowired
	DepMapper depMapper;
	
	@Autowired
	EmpService empService;
	
	@Autowired
	DepService depService;
	


	@Test
	public void insertEmp() {
		Dep dep=new Dep();
		dep.setDid(1);
		dep.setDname("ww");
		empMapper.insertEmp(new Emp(1,"zs",new Date(),dep));	
	}
	@Test
	public void empServiceAddTest() {
		Dep dep=new Dep();
		dep.setDid(2);
		dep.setDname("za");
		empService.addEmp(new Emp(2,"ls",new Date(),dep));
	}
	@Test 
	public void testselectdep() {
		System.out.println(depMapper.selectAllDep());
	}
	@Test 
	public void testserviceselectdep() {
		System.out.println(depService.selectAllDep());
	}
	@Test 
	public void testselectAllEmps() {
		System.out.println(empMapper.selectEmps());
	}
	@Test 
	public void testselectbyeid() {
		System.out.println(empMapper.selectEmpByEid(1));
	}
	@Test 
	public void testdelectemp() {
		empMapper.delectEmp(3);
	}
}
