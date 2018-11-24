package com.tanghailin.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration//加了这个@Configuration，这个类就是applicationContext.xml
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean//负载均衡（随机算法）
//	public IRule getRule() {
//		return new RandomRule();
//	}
	@Bean//负载均衡（轮询算法）
	public IRule getRule2() {
		return new RoundRobinRule();
	}
}
