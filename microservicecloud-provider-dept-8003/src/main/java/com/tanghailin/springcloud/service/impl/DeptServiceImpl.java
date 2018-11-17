package com.tanghailin.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanghailin.springcloud.dao.DeptDao;
import com.tanghailin.springcloud.entities.Dept;
import com.tanghailin.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao deptDao;
	
	@Override
	public boolean addDept(Dept dept) {
		// TODO Auto-generated method stub
		
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		// TODO Auto-generated method stub
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		// TODO Auto-generated method stub
		return deptDao.findAll();
	}

}
