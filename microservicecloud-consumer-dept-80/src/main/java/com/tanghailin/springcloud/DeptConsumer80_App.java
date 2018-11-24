package com.tanghailin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.tanghailin.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(configuration=MySelfRule.class,name="MICROSERVICECLOUD-DEPT")
public class DeptConsumer80_App {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
