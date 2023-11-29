package com.socialnetworkapp.gossipi.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.socialnetworkapp.gossipi.Entity.Status;

@Repository
public interface StatusRepo extends CrudRepository<Status, Integer> {
    
    Status save(Status status);
    ArrayList<Status> findAll();
}
