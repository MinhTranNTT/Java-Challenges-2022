package com.example.factorymethod;

import com.example.factorymethod.message.JSONMessage;
import com.example.factorymethod.message.Message;

public class JSONMessageCreatetor extends MessageCreatetor {
	
	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
}
