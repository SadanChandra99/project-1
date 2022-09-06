package com.capgemini.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Service.UserService;
import com.capgemini.entity.UserEntity;
import com.capgemini.model.UserModel;
import com.capgemini.repository.UserRepository;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserEntity userentity;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	private UserRepository userrepository;
	
	@GetMapping("/login")
	public String login() {
		
		return "Login";
	}
	
	
	@GetMapping("/changepassword")
	public String passwordform() {
		
		return "change";
	}
	
	@RequestMapping(path = "/reset")
	public String changepassword( HttpServletRequest request) {
		String id = request.getParameter("userid");
		String newpassword = request.getParameter("password");
		UserEntity user  = userrepository.findByUserId(id);
		user.setPassword(newpassword);
		userrepository.save(user);
		return "reset";
	}
	
	
	@GetMapping(path = "/processform")
	public String Handleform(HttpServletRequest request) {
		
		String userid = request.getParameter("userid");
		String userpassword = request.getParameter("password");
		System.out.println("user email is :"+ userid);
		System.out.println("user password is :"+ userpassword);
		
		//try
		UserEntity user  = userrepository.findByUserId(userid);
		
		System.out.println("user.getid() is :"+user.getUserId());
		System.out.println("user.getpassword is "+user.getPassword() );
		
		if( user.getPassword().equals(userpassword)) {
			
			return "success";
		}
		else 
		{
			return "reenter";
		}
		//
		
	}
	
	@PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UserModel> addUser(@RequestBody UserModel usermodel){
		return ResponseEntity.ok(userservice.addUser(usermodel));
	}
	
	@GetMapping("/logout")
	public String signOut() {
		
		return "redirect";
	}

}
