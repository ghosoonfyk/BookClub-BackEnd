package com.ga.bookclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ga.bookclub.dao.UserDao;
import com.ga.bookclub.model.User;
import com.ga.bookclub.model.UserDetailsImpl;



@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String emailAddress) throws UsernameNotFoundException{
		User user = dao.findByEmailAddress(emailAddress);
		
		if(user == null)
			throw new UsernameNotFoundException("Not found");
		
		UserDetailsImpl obj = new UserDetailsImpl(user);
		
		return obj;
	}
}