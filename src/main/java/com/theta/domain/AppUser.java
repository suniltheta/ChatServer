package com.theta.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Entity class representing AppUser table.
 * 
 * @author Sunil
 *
 */
@Entity
@Table(name = "login")
public class AppUser implements Serializable {

	/*
	 * Added to ignore serialization warning.
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USERNAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
