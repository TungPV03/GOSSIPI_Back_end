package com.socialnetworkapp.gossipi.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "Comments")
public class Comments {
    
    @Id
    @GeneratedValue
    private int id;

    private String cmtId;
    private String userId;
    private String postId;
    private Timestamp timestamp;
    private String userName;
    private String comment;

    public Comments(){
        super();
    }

    public Comments(int id, String cmtId, String userId, String postId, Timestamp timestamp, String comment) {
        super();
        this.id = id;
        this.cmtId = cmtId;
        this.userId = userId;
        this.postId = postId;
        this.timestamp = timestamp;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCmtId() {
        return cmtId;
    }

    public void setCmtId(String cmtId) {
        this.cmtId = cmtId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    
    
}
