package com.springboot.crud.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.repository.UserRepository;
import com.springboot.userService.service.UserService;


@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {
	
	@Autowired
	private MockMvc mockmvc;
	
	@MockBean
	private UserService userService;
	
	@MockBean
	private UserRepository userRepository;
	
	@Captor
	private ArgumentCaptor<Long> idCaptor;

	@Captor
	private ArgumentCaptor<UserEntity> userCaptor;
	
	@Test

	@DisplayName("test for get method")
	public void testGetUser() throws Exception {
		//UserEntity userEntity=new UserEntity();
		//String getRequestBody = getJsonFormat(userEntity);
		
	}

}
