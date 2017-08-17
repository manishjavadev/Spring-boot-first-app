package com.manish.javadev.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Manish
 *
 */

/*
 * JAXB : Is the annotation @XmlAccessorType is only for Serialization and
 * nothing to do with Binding of data
 */
/* Controls whether fields or Javabean properties are serialized by default. */
@SuppressWarnings("restriction")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class UserEntity {
	private Integer userId;
	private String userName;
	private String location;

	public UserEntity() {
		super();
	}

	public UserEntity(Integer userId, String userName, String location) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.location = location;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
