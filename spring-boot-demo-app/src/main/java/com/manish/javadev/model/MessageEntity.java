package com.manish.javadev.model;

import java.util.Date;

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
public class MessageEntity {
	private Long messageid;
	private String message;
	private Date created;
	private String author;

	public MessageEntity() {
	}

	public MessageEntity(Long messageid, String message, Date created, String author) {
		super();
		this.messageid = messageid;
		this.message = message;
		this.created = created;
		this.author = author;
	}

	public Long getMessageid() {
		return messageid;
	}

	public void setMessageid(Long messageid) {
		this.messageid = messageid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
