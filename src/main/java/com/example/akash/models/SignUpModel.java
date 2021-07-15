package com.example.akash.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_signUp")
public class SignUpModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String firstName;
	String lastName;
	String address;
	String teamName;
	String userName;
	String password;
	String confirmPassword;
	String emailId;
	int mobileNo;
	
	
	
	public SignUpModel() {
		super();
	}
	@Override
	public String toString() {
		return "SignUpModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", teamName=" + teamName + ", userName=" + userName + ", password=" + password + ", confirmPassword="
				+ confirmPassword + ", emailId=" + emailId + ", mobileNo=" + mobileNo + "]";
	}
	public SignUpModel(int id, String firstName, String lastName, String address, String teamName, String userName,
			String password, String confirmPassword, String emailId, int mobileNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.teamName = teamName;
		this.userName = userName;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	
	
}
