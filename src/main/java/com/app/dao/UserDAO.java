package com.app.dao;


import java.util.List;

import org.springframework.stereotype.Component;

import com.app.domain.User;

@Component
public interface UserDAO {
	
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(String id);
	public List<User> getAllUser();
}

