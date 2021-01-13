package com.hcl.phaseend1;

public class User {
	
	String name;
	String password;
	boolean isAdmin;
	
	public User(String name, String password, boolean isAdmin) {
		this.name = name;
		this.password = password;
		this.isAdmin = isAdmin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean getPriveledges() {
		return isAdmin;
	}
	public void setPriveledges(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", Administrative Priviledges=" + isAdmin + "]";
	}
	
}
