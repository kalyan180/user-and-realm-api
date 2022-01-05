package com.springboot.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private com.springboot.userService.service.UserService userService;
	
	@GetMapping
	public List<UserEntity> getUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<UserEntity> getUserById(@PathVariable Integer id){
		return ResponseEntity.ok().body(userService.getUserById(id));
	}
	
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) throws Exception  {
		return new ResponseEntity<>(userService.createUser(user),HttpStatus.CREATED);
	}
	
	
	  @PutMapping(value="/updateuser/{id}") 
	  public ResponseEntity<UserEntity> updateUser(@RequestBody User user,@PathVariable Integer id) { 
	   
	 return ResponseEntity.ok().body(userService.updateUser(user,id)); 
	  }
	 	
	
	@DeleteMapping(value="/deleteuser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer id)
	{
		userService.deleteUser(id);
	return new ResponseEntity<>(HttpStatus.OK);
	}
	/*
	 * @PutMapping("/updateUser") public User updateUser(@RequestBody User user) {
	 * userService.updateUser(user); return user; }
	 */

}
