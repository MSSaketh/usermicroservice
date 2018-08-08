package com.stackroute.userservice.services;

import org.springframework.http.ResponseEntity;

public interface UserService {
	public ResponseEntity<String> hello();
}
