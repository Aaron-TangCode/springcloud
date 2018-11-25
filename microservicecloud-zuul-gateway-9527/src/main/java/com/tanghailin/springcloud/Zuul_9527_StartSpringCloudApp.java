package com.tanghailin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@SpringBootApplication
public class Zuul_9527_StartSpringCloudApp {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Zuul_9527_StartSpringCloudApp.class, args);
	}

}
