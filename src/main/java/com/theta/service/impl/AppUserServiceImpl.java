package com.theta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theta.dao.AppUserDao;
import com.theta.domain.AppUser;
import com.theta.service.AppUserService;

/**
 * Implementation for AppUserService.
 * 
 * @author Sunil
 *
 */
@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserDao userDao;

	@Override
	public List<AppUser> getAllUsers() {
		return userDao.getAllUsers();
	}

}
