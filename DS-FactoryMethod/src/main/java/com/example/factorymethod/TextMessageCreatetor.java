package com.example.factorymethod;

import com.example.factorymethod.message.Message;
import com.example.factorymethod.message.TextMessage;

public class TextMessageCreatetor extends MessageCreatetor {
	
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
