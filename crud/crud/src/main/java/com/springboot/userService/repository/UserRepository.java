package com.springboot.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.userService.entity.UserEntity;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	
}
