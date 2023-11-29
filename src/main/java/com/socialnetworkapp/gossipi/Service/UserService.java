package com.socialnetworkapp.gossipi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialnetworkapp.gossipi.Entity.Users;
import com.socialnetworkapp.gossipi.Repository.UserRepo;

@Service
public class UserService {
    
    @Autowired
    UserRepo userRepo;

    public Users submitMetaDataOfUser(Users user){
        return userRepo.save(user);
    }

    public Users displayUserMetaData(String userId){
        return userRepo.findByUserId(userId);
    }

    public Users updateUserMetaData(String userId,Users updatedUser){
        Users existingUser = userRepo.findByUserId(userId);
        if (existingUser != null) {
            if (updatedUser.getProfileImage() != null) {
                existingUser.setProfileImage(updatedUser.getProfileImage());
            }
            return userRepo.save(existingUser);
        } else {
            return null;
        }
    }
}
