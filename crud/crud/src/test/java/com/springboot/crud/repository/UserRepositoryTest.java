package com.springboot.crud.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.model.User;
import com.springboot.userService.repository.UserRepository;


@ExtendWith(SpringExtension.class)

@DataJpaTest
@DisplayName("testing user repository")
public class UserRepositoryTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@Test
	@DisplayName("test findById")
	void testGetUserById() {
		Optional<UserEntity> userOptional = userRepository.findById(1);
		assertThat(userOptional.isPresent()).isTrue();
		UserEntity user = userOptional.get();
		assertThat(user.getId()).isEqualTo(1);
	}
	
	private UserEntity createUser() {
		UserEntity user= new UserEntity(1,"kalyan","kalyan@gmail.com",914567896L,1);
		return  user;
	}
	
	@Test 
	@Sql(scripts = "classpath:create-test-data.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "classpath:cleanup-test-data.sql", executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	@DisplayName("test update Id")
	void testUpdateUser() {
		UserEntity userEntity= createUser();
	}
	
	@Test
	public void createUserTest() {
		User user = new User();
		
		Assertions.assertThat(user.getId().SIZE>0);
				
		
	}
	
	

}
