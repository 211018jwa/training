package com.revature.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.revature.springbootdemo.exception.UserNotFoundException;
import com.revature.springbootdemo.model.User;
import com.revature.springbootdemo.service.UserService;

@RestController
public class DemoController {
	
	@Autowired
	private UserService us;
	
	@GetMapping(path = "/demo")
	public String test() {
		return "Hello world";
	}
	
	@RequestMapping(path = "/formdatatest", method = RequestMethod.GET)
	public ResponseEntity<Void> formDataTest(@RequestParam("testing") String test, @RequestParam("file") MultipartFile file) {
		System.out.println(test);
		System.out.println(file);
		
		return ResponseEntity.status(200).build();
	}
	
}
