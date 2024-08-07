package com.bean;

import org.springframework.web.multipart.MultipartFile;

public class EUserBean {

	//bean class is related to TABLE in database
	
	//when we create a bean for the databases then add the one more member for the primary key
	private Integer userId;
	
	private String firstName;
	private String email;
	private String password;
	private MultipartFile profilePic;
	
	private String profilePicPath;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MultipartFile getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(MultipartFile profilePic) {
		this.profilePic = profilePic;
	}
	public String getProfilePicPath() {
		return profilePicPath;
	}
	public void setProfilePicPath(String profilePicPath) {
		this.profilePicPath = profilePicPath;
	}
	@Override
	public String toString() {
		return "EUserBean [userId=" + userId + ", firstName=" + firstName + ", email=" + email + ", password="
				+ password + ", profilePic=" + profilePic + ", profilePicPath=" + profilePicPath + "]";
	}
	
	
}
