package com.study.spring.case03.controller;
import org.springframework.stereotype.Controller;
import com.study.spring.case03.service.UserService;
import com.study.spring.case03.service.UserServiceImpl;
@Controller
public class UserController {
	private UserService service = new UserServiceImpl();
	public UserController() {
		System.out.println("UserController()");
	}
	public void appendUser(){
		service.addUser();
	}
}
