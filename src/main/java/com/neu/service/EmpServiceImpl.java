package com.neu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neu.entity.Emp;
import com.neu.entity.EmpExample;
import com.neu.entity.EmpExample.Criteria;
import com.neu.mapper.EmpMapper;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpMapper empMapper;
	@Override
	public int insert(Emp entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Emp entity) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Emp getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Emp> getPaged(int pageNum, int pageSize, Map<String, Object> params) {
		PageHelper.startPage(pageNum, pageSize);
		EmpExample example = new EmpExample();
		List<Emp> list = empMapper.selectByExample(example);
		PageInfo<Emp> pageInfo = new PageInfo<>(list);
		return pageInfo;
	}
	@Override
	public List<Emp> getAll() {
		EmpExample example = new EmpExample();
		
		return empMapper.selectByExample(example);
	}

	@Override
	public List<Emp> getByName(Map<String, Object> params) {
		EmpExample example = new EmpExample();
		if(params.get("name")==null) {
			example.or().andIdEqualTo((int)params.get("id"));
			return empMapper.selectByExample(example);
		}else if(params.get("id")==null) {
			example.or().andNameEqualTo((String)params.get("name"));
			return empMapper.selectByExample(example);
		}
		example.or().andIdEqualTo((int)params.get("id")).andNameEqualTo((String)params.get("name"));
		return empMapper.selectByExample(example);
	}

}
