package com.socialnetworkapp.gossipi.Repository;

import org.springframework.stereotype.Repository;

import com.socialnetworkapp.gossipi.Entity.Users;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepo extends CrudRepository<Users, Integer>{

    Users save(Users users);
    Users findByUserId(String userId);
}
