package com.realm.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realm.api.dao.ApiDao;
import com.realm.api.model.*;

@RestController
@RequestMapping("/api")
public class ApiController {
		
		@Autowired
		private ApiDao apiDao;
		
		@GetMapping("/{id}")
		public Api getApiById(@PathVariable Integer id){
			return apiDao.getApi(id);
		}
		
		@PostMapping("/createapi")
		public Api createApi(@RequestBody Api api)
		{
			return apiDao.createApi(api);
		}
		
		
		  @PutMapping(value="/updateapi") 
		  public Api updateApi(@RequestBody Api api)
		  { 
			  return apiDao.updateApi(api);
		  }
		 	
		
		@DeleteMapping(value="/deleteapi/{id}")
		public String deleteApi(@PathVariable Integer id)
		{
		return apiDao.deleteApiById(id);
		}

	
}
