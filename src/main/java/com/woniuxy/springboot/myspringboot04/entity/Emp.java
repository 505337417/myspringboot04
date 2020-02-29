package com.woniuxy.springboot.myspringboot04.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {

	private Integer eid;
	private String ename;
	private Date hirdate;
	private Dep dep;
	
}
