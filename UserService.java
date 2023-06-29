package com.webosmotic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.webosmotic.modal.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<User>();

  User user=new User("hdcus123","gagan","gagan@gmail.com");
  
  User user1=new User("djfd456","bhaveshsir","bhavesh@gmail.com");
  
  User user2=new User("djfd457","arifsir","arif@gmail.com");
  
  User user3=new User("djfd458","rohansir","rohan@gmail.com");
  
	
	
	
	
	public UserService() {

		store.add(user);
		store.add(user1);
		store.add(user2);
		store.add(user3);
	
	}

	public List<User> getUser() {
		return this.store;
	}

}
