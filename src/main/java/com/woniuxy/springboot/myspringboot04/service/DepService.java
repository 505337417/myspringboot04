package com.woniuxy.springboot.myspringboot04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.woniuxy.springboot.myspringboot04.entity.Dep;
import com.woniuxy.springboot.myspringboot04.entity.Emp;


public interface DepService {

	List<Dep> selectAllDep();
}
