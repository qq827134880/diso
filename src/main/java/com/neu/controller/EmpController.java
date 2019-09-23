package com.neu.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.neu.entity.Emp;
import com.neu.service.EmpService;

@RestController
@RequestMapping("emp")
public class EmpController {
	@Autowired
	private EmpService empService;
	@RequestMapping("getAll")
	public List<Emp> getAll(){
		
		return empService.getAll();
	}
	
	@RequestMapping("ByName")
	public List<Emp> getByName(Map<String, Object> params){
		return empService.getByName(params);
	}
	
	
	
	
	
	
	
	
	
}
