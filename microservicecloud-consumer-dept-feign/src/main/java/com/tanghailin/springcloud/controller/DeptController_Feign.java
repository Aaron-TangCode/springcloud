package com.tanghailin.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tanghailin.springcloud.entities.Dept;
import com.tanghailin.springcloud.entities.DeptClientService;

@RestController
public class DeptController_Feign {
	@Autowired
	private DeptClientService deptClientService;
	
	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept) {
		return this.deptClientService.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.deptClientService.get(id);
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list() {
		return this.deptClientService.list();
	}
}
