package com.woniuxy.springboot.myspringboot04.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.woniuxy.springboot.myspringboot04.entity.Stu;

@Mapper
public interface StuMapper {

	void insertStu(Stu stu);
}
