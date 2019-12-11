package com.songjiale.cms.pojo;

import java.io.Serializable;

public class Tag implements Serializable{
	private Integer id;
	private String tgname;
	public Tag(Integer id, String tgname) {
		super();
		this.id = id;
		this.tgname = tgname;
	}
	public Tag() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tag [id=" + id + ", tgname=" + tgname + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTgname() {
		return tgname;
	}
	public void setTgname(String tgname) {
		this.tgname = tgname;
	}
	
	

}
