package com.UmsServer.Ums.services;

import java.util.List;

import com.UmsServer.Ums.model.User;

public interface UserService {
	public User addUser(User user);
	public List<User> getUsers();
	public User getUser(long userId);
	public User updateUser(User user);
	public User deleteUser(long userId);
}
