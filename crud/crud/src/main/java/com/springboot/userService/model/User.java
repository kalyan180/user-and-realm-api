package com.springboot.userService.model;

public class User {
	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private Long mobile;
	
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


	 
}
