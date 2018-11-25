package com.tanghailin.springcloud.entities;

import java.util.List;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{

	@Override
	public DeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				// TODO Auto-generated method stub
				Dept dept = new Dept();
				dept.setDeptno(id);
				dept.setDname("ID:"+id+"没有对应的信息，这个数据不在数据库,服务已经崩了，服务降级");
				return dept;
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
