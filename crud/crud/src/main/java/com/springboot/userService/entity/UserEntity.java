package com.springboot.userService.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="user_entity")
@Table(name="user_entity")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private Long mobile;
	@Column
	private Integer realId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Integer getRealId() {
		return realId;
	}
	public void setRealId(Integer realId) {
		this.realId = realId;
	}
	
	public UserEntity(Integer id, String name,String email,Long mobile,Integer realId) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.mobile=mobile;
		this.realId=realId;
	}
	public UserEntity() {
		
	}
	
}
