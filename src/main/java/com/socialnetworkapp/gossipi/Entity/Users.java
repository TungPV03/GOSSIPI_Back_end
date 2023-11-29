package com.socialnetworkapp.gossipi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import com.sun.istack.NotNull;

@Entity(name = "users")
public class Users {
	@Id
	@GeneratedValue
	private int id;
	
	@NotNull
	private String userName;
	private String userId;
	private String name;
	private String profileImage;

	public Users() {
		super();
	}

	public Users(int id, String userName, String userId, String name, String profileImage) {
		super();
		this.id = id;
		this.userName = userName;
		this.userId = userId;
		this.name = name;
		this.profileImage = profileImage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	
	
}
