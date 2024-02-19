package com.ArraysEx;

public class SignupEx {
	
	private int id;
	private String userName;
	private String password;
	private String gmail;
	private Long phoneNum;
	
	
	public SignupEx(int id, String userName, String password, String gmail, Long phoneNum) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.gmail = gmail;
		this.phoneNum = phoneNum;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}

	@Override
	public String toString() {
		return "SignupEx [id=" + id + ", userName=" + userName + ", password=" + password + ", gmail=" + gmail
				+ ", phoneNum=" + phoneNum + "]";
	}	
	
}
