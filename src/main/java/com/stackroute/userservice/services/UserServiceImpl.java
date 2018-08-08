package com.stackroute.userservice.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

	RestTemplate restTemplate = new RestTemplate();
	String url = "http://localhost:8090/api/v1/movieservice/movies";

	@Override
	public ResponseEntity<String> hello() {
		ResponseEntity<String> list;
		list = restTemplate.getForEntity(url, String.class);
		return list;
	}

}
