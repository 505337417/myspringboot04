package com.woniuxy.springboot.myspringboot04.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.woniuxy.springboot.myspringboot04.entity.Dep;
import com.woniuxy.springboot.myspringboot04.entity.Emp;

@Mapper
public interface DepMapper {


	List<Dep> selectAllDep();
}
