package com.woniuxy.springboot.myspringboot04.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.springboot.myspringboot04.entity.Dep;
import com.woniuxy.springboot.myspringboot04.entity.Emp;
import com.woniuxy.springboot.myspringboot04.service.DepService;
import com.woniuxy.springboot.myspringboot04.service.EmpService;



@Controller
public class UserController {

	@Autowired
	DepService depService;
	@Autowired
	EmpService empService;

	//验证是否登录
	@RequestMapping("/user/login")
	public String dosome(String username,String password,
				Model model,HttpSession session) {
		System.out.println(username);
		System.out.println(password);
		if (!StringUtils.isEmpty(username) && password.equals("aaa")) {
			session.setAttribute("username", username);
			return "index";
		}else {

			model.addAttribute("msg","用户名密码错误");
			return "login";	
		}
	}
	//查询所有员工
	@GetMapping("/emps")
	public String selectEmps(Model model ) {
		List<Emp> emps = empService.selectAllEmps();
		//List<Emp> emps=new ArrayList<Emp>();
		//emps.add(new Emp(1,"zs",new Date(),new Dep(1,"d01")));
		//emps.add(new Emp(2,"ls",new Date(),new Dep(2,"d02")));
		model.addAttribute("emps",emps);
		return "emplist";	
		
	}
	
	//添加员工方法的前置查询
	@GetMapping("/emp")
	public String selectDep(Model model ) {
//		List<Dep> deps=new ArrayList<Dep>();
//		deps.add(new Dep(1,"d01"));
//		deps.add(new Dep(2,"d02"));
		List<Dep> deps = depService.selectAllDep();
		System.out.println(deps);
		model.addAttribute("deps",deps);
		return "empadd";	
		
	}
	//添加员工进数据库的方法
	@PostMapping("/emp")
	public String addEmp(Model model,Emp emp ) {
		
		empService.addEmp(emp);
		//System.out.println(emp);
		//添加员工的方法，这里会在empadd页面接收一个did，是因为需要通过did把部门查询出来，然后合着传过来的
		//emp对象一起存进数据库
		return "redirect:/emps";	
		
	}
	//修改方法之前置查询方法
	@GetMapping("/emp/{eid}")
	public String selectDepAndEmp(Model model,@PathVariable("eid") Integer eid) {
		//Emp emp=null;
		//if (eid==1) {
		//	emp=new Emp(1,"zs",new Date(),new Dep(1,"d01"));
		//}else {
		//	emp=new Emp(2,"ls",new Date(),new Dep(2,"d02"));
		//}
		Emp emp = empService.selectEmpByEid(eid);
		//需要把查询出来的那一个员工装进域中，然后合着部门显示到域中
		model.addAttribute("emp",emp);
		//List<Dep> deps=new ArrayList<Dep>();
		//上面已经有一个方法打了deps域，但是由于是request请求，所以需要重新打
		//deps.add(new Dep(1,"d01"));
		//deps.add(new Dep(2,"d02"));
		List<Dep> deps = depService.selectAllDep();
		model.addAttribute("deps",deps);
		return "empupdata";	
		
	}
	
	//修改员工进数据库方法
	@PutMapping("/emp")
	public String updataEmp(Model model,Emp emp ) {
		empService.updateEmp(emp);
		System.out.println("修改员工："+emp);
		//添加员工的方法，这里会在empadd页面接收一个did，是因为需要通过did把部门查询出来，然后合着传过来的
		//emp对象一起存进数据库
		return "redirect:/emps";	
		
	}
	
	//删除员工进数据库方法
		@DeleteMapping("/emp/{eid}")
		public String delectEmp(Model model,@PathVariable("eid") Integer eid ) {
			System.out.println(eid);
			//添加员工的方法，这里会在empadd页面接收一个did，是因为需要通过did把部门查询出来，然后合着传过来的
			//emp对象一起存进数据库
			return "redirect:/emps";	
			
		}
}
