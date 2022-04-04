package com.book.Demo.Exception;

import java.util.Date;

public class ExceptionDemo {
	private Date timestamp;
	private String message;
	private String detalis;
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetalis() {
		return detalis;
	}
	public void setDetalis(String detalis) {
		this.detalis = detalis;
	}
	public ExceptionDemo(Date timestamp, String message, String detalis) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detalis = detalis;
	}
	

}
