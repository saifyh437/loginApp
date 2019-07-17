package com.admin.login.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.admin.login.request.UserLoginRequest;
import com.admin.login.response.UserLoginResponse;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

	@PostMapping("/login/authenticate")
    public UserLoginResponse login(@RequestBody UserLoginRequest userLoginReq) {
		
		UserLoginResponse userLoginResponse = new UserLoginResponse();
		
		if(userLoginReq.getUsername().equals("user") && userLoginReq.getPassword().equals("password"))
			userLoginResponse.setUrl("home");
		else
			userLoginResponse.setUrl("error");
		
		
		
		return userLoginResponse;
     
    }

}
