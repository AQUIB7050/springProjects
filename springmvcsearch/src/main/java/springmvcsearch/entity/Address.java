package springmvcsearch.entity;

public class Address {
	
	private String userStreet;
	private String userCity;
	
	public String getUserStreet() {
		return userStreet;
	}
	public void setUserStreet(String userStreet) {
		this.userStreet = userStreet;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	@Override
	public String toString() {
		return "Address [userStreet=" + userStreet + ", userCity=" + userCity + "]";
	}
	
	

}
