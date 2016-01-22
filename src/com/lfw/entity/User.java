package com.lfw.entity;

public class User {
	private Integer userId;			//用户ID
	private String 	userName;		//用户姓名
	private String 	userPassword;	//用户密码
	private String 	userPhone;		//用户手机
	private String 	userMail;		//用户邮箱

	public User() {
		super();
	}
	public User(Integer userId, String userName, String userPassword, String userPhone, String userMail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.userMail = userMail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userPhone="
				+ userPhone + ", userMail=" + userMail + "]";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
}
