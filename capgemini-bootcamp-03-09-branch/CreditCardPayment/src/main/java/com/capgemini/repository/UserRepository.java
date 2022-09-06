package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.entity.UserEntity;
import com.capgemini.model.UserModel;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{
	
	public UserEntity save(UserEntity userentity);
	
	public UserEntity findByUserId(String userid);

}
