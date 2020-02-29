package com.woniuxy.springboot.myspringboot04.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.woniuxy.springboot.myspringboot04.entity.Emp;

@Mapper
public interface EmpMapper {


	void insertEmp(Emp emp);
	List<Emp> selectEmps();
	Emp selectEmpByEid(Integer eid);
	void delectEmp(Integer eid);
}
