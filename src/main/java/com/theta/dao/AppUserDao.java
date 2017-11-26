package com.theta.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.theta.domain.AppUser;

/**
 * Spring data jpa repository for APPUSER table.
 * @author Sunil
 *
 */
@Transactional
@Repository
public interface AppUserDao extends CrudRepository<AppUser, Long>{
	
	@Query(value = "SELECT A FROM AppUser A")
	public List<AppUser> getAllUsers();
}
