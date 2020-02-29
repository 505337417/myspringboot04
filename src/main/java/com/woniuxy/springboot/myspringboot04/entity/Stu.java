package com.woniuxy.springboot.myspringboot04.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Stu {

	private Integer sid;
	private String sname;
	private Integer sage;
	private Date birthdate;
}
