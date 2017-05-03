package com.demo.spring;

public class Mail {
	private String[] toAddress;
	private String from;
	Message message;

	public Mail() {

	}

	public String[] getToAddress() {
		return toAddress;
	}

	public void setToAddress(String[] toAddress) {
		this.toAddress = toAddress;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	
public void doInit(){
	System.out.println("The Mail Object initialised...");
}

public void doClean(){
	System.out.println("The Mail Object removed....");
}
}
