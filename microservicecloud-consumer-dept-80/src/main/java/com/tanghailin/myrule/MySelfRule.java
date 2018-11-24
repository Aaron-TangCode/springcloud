package com.tanghailin.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {
	@Bean
	public IRule getRule() {
		return new RandomRule_ZY();
	}
}
