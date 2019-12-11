package com.songjiale.cms.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Comment implements Serializable {
	private Integer id;
	private Integer artcleId;
	private Integer userId;
	private String content;
	private Date created;
	public Comment(Integer id, Integer artcleId, Integer userId, String content, Date created) {
		super();
		this.id = id;
		this.artcleId = artcleId;
		this.userId = userId;
		this.content = content;
		this.created = created;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Comment [id=" + id + ", artcleId=" + artcleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArtcleId() {
		return artcleId;
	}
	public void setArtcleId(Integer artcleId) {
		this.artcleId = artcleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	

}
