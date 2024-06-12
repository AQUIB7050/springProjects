package springmvcsearch.entity;

import java.util.Date;
import java.util.List;

public class Student {
	
	private String userName;
	private String userEmail;
	private Date userDOB;
	private List<String> userCourses;
	private String userGender;
	private String userType;
	
	private Address address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Date getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(Date userDOB) {
		this.userDOB = userDOB;
	}
	public List<String> getUserCourses() {
		return userCourses;
	}
	public void setUserCourses(List<String> userCourses) {
		this.userCourses = userCourses;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [userName=" + userName + ", userEmail=" + userEmail + ", userDOB=" + userDOB + ", userCourses="
				+ userCourses + ", userGender=" + userGender + ", userType=" + userType + ", address=" + address + "]";
	}
	
	
	
	

}
