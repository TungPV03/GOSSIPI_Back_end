package com.socialnetworkapp.gossipi.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.socialnetworkapp.gossipi.Entity.Status;
import com.socialnetworkapp.gossipi.Service.StatusService;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {
    
    @Autowired
    StatusService statusService;


    @PostMapping("")
    private Status submiStatus(@RequestBody Status status){
        return statusService.submitStatusToDB(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatus(){
        return statusService.retrieveStatus();
    }
}

