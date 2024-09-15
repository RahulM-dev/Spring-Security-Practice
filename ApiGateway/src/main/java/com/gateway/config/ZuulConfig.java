package com.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gateway.filter.CustomFilter;

@Configuration
public class ZuulConfig {

	@Bean
	public CustomFilter customFilter() {
		return new CustomFilter();
	}
}
