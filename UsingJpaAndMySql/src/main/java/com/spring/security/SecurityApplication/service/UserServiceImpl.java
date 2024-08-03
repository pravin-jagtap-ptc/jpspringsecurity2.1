package com.spring.security.SecurityApplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.security.SecurityApplication.entity.User;
import com.spring.security.SecurityApplication.model.MyUserDetails;
import com.spring.security.SecurityApplication.repo.UserRepoImpl;

@Service
public class UserServiceImpl implements UserDetailsService{

	@Autowired
	private UserRepoImpl userRepoImpl;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user =  userRepoImpl.findByUserName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("User does not exist : "+username));
		System.out.println("USer details for username : "+ username +" are : "+ user.get());
		return new MyUserDetails(user.get());
	}

}
