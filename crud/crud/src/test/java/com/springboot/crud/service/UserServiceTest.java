package com.springboot.crud.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.mapper.UserMapper;
import com.springboot.userService.model.User;
import com.springboot.userService.repository.UserRepository;
import com.springboot.userService.service.UserServiceImpl;

@ExtendWith(MockitoExtension.class) 
public class UserServiceTest {
	
	@Mock
	private UserRepository userRepository;
	
	@InjectMocks
	private UserServiceImpl userServiceImpl;
	
	private UserMapper userMapper;
	
	private User user= new User();
	
	private com.springboot.userService.entity.UserEntity UserEntity=new UserEntity();
	
	public UserServiceTest(UserMapper userMapper) {
		this.userMapper=userMapper;
	}
	
	@Test  
	@DisplayName("junit to test create UserEntity") 
	public void testCreateUser() throws Exception { 
		
		UserEntity.setId(1);
		UserEntity.setName("kalyan");
		UserEntity.setEmail("kalyan@gmail.com");
		UserEntity.setMobile(91345678L);
		UserEntity.setRealId(1);
		
		UserEntity userEntity1= userServiceImpl.createUser(UserEntity);
	
	  
	  assertEquals(userEntity1.getId(),UserEntity.getId());
	 }

}
