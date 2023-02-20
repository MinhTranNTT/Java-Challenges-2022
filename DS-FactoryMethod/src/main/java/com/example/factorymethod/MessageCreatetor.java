package com.example.factorymethod;

import com.example.factorymethod.message.Message;

public abstract class MessageCreatetor {
	
	// -- Factory Method
	public abstract Message createMessage();
	
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}
	
}
