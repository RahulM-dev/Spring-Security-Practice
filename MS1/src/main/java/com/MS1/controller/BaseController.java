package com.MS1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class BaseController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/index")
	public String index() {
		return "This is the index page";
	}
	
	@GetMapping("/apiCall")
	public String apiCall() {
		
	//	RestTemplate rest = new RestTemplate();
		System.out.println("Before");
		HttpHeaders headers = new HttpHeaders();
		headers.set("Internal-AuthToken", "anonymous");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		String data = restTemplate.exchange("http://MS2/index", HttpMethod.GET, entity, String.class).getBody();
		System.out.println("After");
		return "This is the index page +" + data;
	}
	
	
}
