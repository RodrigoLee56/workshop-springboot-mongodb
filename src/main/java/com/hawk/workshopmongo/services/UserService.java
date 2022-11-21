package com.hawk.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hawk.workshopmongo.domain.User;
import com.hawk.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository; 
	
	public List<User> findAll() {
		List<User> list = userRepository.findAll(); 
		return list;
	}
}
