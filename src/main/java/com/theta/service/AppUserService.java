package com.theta.service;

import com.theta.domain.AppUser;

import java.util.List;

/**
 * Service layer for AppUser. Business logic would be defined here.
 * 
 * @author Sunil
 *
 */
public interface AppUserService {

	/**
	 * Get list of all app users.
	 * 
	 * @return List of App users
	 */
	public List<AppUser> getAllUsers();
}
