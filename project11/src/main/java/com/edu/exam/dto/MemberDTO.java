package com.edu.exam.dto;

public class MemberDTO {

	private String id;
	private String passwd;
	private String name;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", passwd=" + passwd + ", name=" + name + "]";
	}
	
	
	
}
