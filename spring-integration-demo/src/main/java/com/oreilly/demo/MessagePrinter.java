package com.oreilly.demo;

import org.springframework.messaging.Message;

public class MessagePrinter { 
	
	org.springframework.jms.core.JmsTemplate jmsTemplate;
	

	public org.springframework.jms.core.JmsTemplate getJmsTemplate() {
		return jmsTemplate;
	}


	public void setJmsTemplate(org.springframework.jms.core.JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}


	public void print(Message<?> message){
		System.out.println("Printing the message:");
		System.out.println(message);
	}
}
