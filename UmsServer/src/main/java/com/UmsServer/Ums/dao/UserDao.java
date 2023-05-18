package com.UmsServer.Ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UmsServer.Ums.model.User;
// it takes User and id, since id type is long.
public interface UserDao extends JpaRepository<User, Long>{
	
}
