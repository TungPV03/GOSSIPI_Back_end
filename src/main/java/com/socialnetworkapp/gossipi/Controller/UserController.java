package com.socialnetworkapp.gossipi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialnetworkapp.gossipi.Entity.Users;
import com.socialnetworkapp.gossipi.Service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    private Users submitUser(@RequestBody Users users){
        return userService.submitMetaDataOfUser(users);
    }

    @GetMapping("/{userid}")
    private Users getUserDetails(@PathVariable("userid") String userId){
        return userService.displayUserMetaData(userId);
    }

    @PatchMapping("/{userId}")
    private Users updateUserMetaData(@PathVariable("userId") String userId, @RequestBody Users updatedUser) {
        return userService.updateUserMetaData(userId, updatedUser);
    }
}
