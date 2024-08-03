package com.spring.security.SecurityApplication.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.security.SecurityApplication.entity.User;

public interface UserRepoImpl extends JpaRepository<User, Integer> {

	public Optional<User> findByUserName(String userName);
}
