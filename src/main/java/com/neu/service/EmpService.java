package com.neu.service;

import java.util.List;
import java.util.Map;

import com.neu.entity.Emp;

public interface EmpService extends IService<Emp>{
	List<Emp> getByName(Map<String, Object> params);
}
