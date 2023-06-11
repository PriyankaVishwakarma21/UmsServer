package com.UmsServer.Ums.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UmsServer.Ums.dao.UserDao;
import com.UmsServer.Ums.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User addUser(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUser(long userId) {
		User user = null;
		try {
			user = userDao.findById(userId).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	@Override
	public User deleteUser(long userId) {
		User user = userDao.findById(userId).get();
		userDao.delete(user);
		return user;
	}

}
