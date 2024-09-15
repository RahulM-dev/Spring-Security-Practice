package com.MS2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.RequestHeaderRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception{
//		httpSecurity	
//					.authorizeRequests()
//					.antMatchers("/**")
//					.hasIpAddress("127.0.0.1")
//					.anyRequest().denyAll()
//					.and()
//					.csrf().disable();
//	}
//	
	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception{
		httpSecurity
					.authorizeRequests()
					.requestMatchers(new RequestHeaderRequestMatcher("Internal-AuthToken", "anonymous")).permitAll()
					.requestMatchers(new RequestHeaderRequestMatcher("External-AuthToken", "identityless")).permitAll()
					.anyRequest().denyAll().and().csrf().disable();
	}
}

