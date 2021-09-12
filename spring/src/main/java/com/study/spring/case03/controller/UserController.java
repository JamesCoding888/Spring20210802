package com.study.spring.case03.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.study.spring.case03.service.UserService;
import com.study.spring.case03.service.UserServiceImpl;
@Controller
public class UserController {
//	private UserService userService = new UserServiceImpl();
	
	@Autowired(required = false) // @Autowired 預設是這樣 @Autowired(required = true) 
	private UserService userService;
	
	public UserController() {
		System.out.println("UserController()");
	}
	public void appendUser(){
		if(userService !=null) {
			userService.addUser();
		}
		
	}
}
