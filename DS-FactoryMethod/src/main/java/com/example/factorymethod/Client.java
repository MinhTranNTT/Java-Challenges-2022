package com.example.factorymethod;

import com.example.factorymethod.message.Message;

public class Client {
	
	public static void main(String[] args) {
		printMessage(new JSONMessageCreatetor());
		
		printMessage(new TextMessageCreatetor());
	}
	
	public static void printMessage(MessageCreatetor createtor) {
		Message msg = createtor.getMessage();
		System.out.println(msg);
		
	}
}
