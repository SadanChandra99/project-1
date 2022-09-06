package com.capgemini.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.Mapper.UserMapper;
import com.capgemini.Service.UserService;
import com.capgemini.entity.UserEntity;
import com.capgemini.model.UserModel;
import com.capgemini.repository.UserRepository;

@Component
public class UserServiceImplement implements UserService{

	@Autowired
	private UserRepository userrepository;
	@Autowired
	private UserMapper usermapper;
	
	@Override
	public UserModel addUser(UserModel usermodel) {
		// TODO Auto-generated method stub
		UserEntity userentity = userrepository.save(usermapper.MapModelToEntity(usermodel));
		return usermapper.MapEntityToModel(userentity);
	}

	@Override
	public UserModel signIn(UserModel usermodel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String signOut() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel changePassword(String userid, UserModel usermodel) {
		// TODO Auto-generated method stub
		return null;
	}

}
