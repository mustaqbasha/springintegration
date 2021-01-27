package com.oreilly.demo;



// Simple message pojo class.
public class Message {

	// message id
	private  int id;
	// message text
	private  String message;

	public Message( final int id,  final String message) {
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setId(int id) {
		this.id=id;
		
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + "]";
	}
}
