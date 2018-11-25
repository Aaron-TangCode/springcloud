package com.tanghailin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@EnableHystrixDashboard
@SpringBootApplication
public class DeptConsumer_DashBoard_App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
	}

}
