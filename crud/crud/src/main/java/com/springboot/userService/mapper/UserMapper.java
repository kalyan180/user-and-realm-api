package com.springboot.userService.mapper;

import org.springframework.stereotype.Component;

import com.springboot.userService.entity.UserEntity;
import com.springboot.userService.model.User;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

@Component
public class UserMapper extends ConfigurableMapper {
	
	@Override
	protected void configure(MapperFactory factory) {
		factory.classMap(User.class, UserEntity.class)
		       .field("id","id")
		       .field("name","name")
		       .field("email","email")
		       .field("mobile","mobile")
		       .field("realId", "realId")
		       .register();
	}

}
