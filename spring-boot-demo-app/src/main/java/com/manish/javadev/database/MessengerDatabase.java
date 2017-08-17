package com.manish.javadev.database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.manish.javadev.model.MessageEntity;
import com.manish.javadev.model.UserEntity;

public class MessengerDatabase {
	private static Map<Integer, MessageEntity> messengerMap = new HashMap<Integer, MessageEntity>();
	private static Map<Integer, UserEntity> userMap = new HashMap<Integer, UserEntity>();

	static {
		// Message Database
		MessageEntity message1 = new MessageEntity(new Long(1), "hello manish1", new Date(), "manish1");
		MessageEntity message2 = new MessageEntity(new Long(2), "hello manish2", new Date(), "manish2");
		MessageEntity message3 = new MessageEntity(new Long(3), "hello manish3", new Date(), "manish3");
		MessageEntity message4 = new MessageEntity(new Long(4), "hello manish4", new Date(), "manish4");
		MessageEntity message5 = new MessageEntity(new Long(5), "hello manish5", new Date(), "manish5");
		MessageEntity message6 = new MessageEntity(new Long(6), "hello manish6", new Date(), "manish6");
		MessageEntity message7 = new MessageEntity(new Long(7), "hello manish7", new Date(), "manish7");
		MessageEntity message8 = new MessageEntity(new Long(8), "hello manish8", new Date(), "manish8");
		MessageEntity message9 = new MessageEntity(new Long(9), "hello manish9", new Date(), "manish9");
		MessageEntity message10 = new MessageEntity(new Long(10), "hello manish10", new Date(), "manish10");
		messengerMap.put(1, message1);
		messengerMap.put(2, message2);
		messengerMap.put(3, message3);
		messengerMap.put(4, message4);
		messengerMap.put(5, message5);
		messengerMap.put(6, message6);
		messengerMap.put(7, message7);
		messengerMap.put(8, message8);
		messengerMap.put(9, message9);
		messengerMap.put(10, message10);

		// Messenger UserEntity Database
		UserEntity userEntity1 = new UserEntity(1, "Manish1", "Lucknow");
		UserEntity userEntity2 = new UserEntity(2, "Manish2", "Lucknow");
		UserEntity userEntity3 = new UserEntity(3, "Manish2", "Lucknow");
		UserEntity userEntity4 = new UserEntity(4, "Manish4", "Lucknow");
		UserEntity userEntity5 = new UserEntity(5, "Manish5", "Lucknow");

		userMap.put(1, userEntity1);
		userMap.put(2, userEntity2);
		userMap.put(3, userEntity3);
		userMap.put(4, userEntity4);
		userMap.put(5, userEntity5);

	}

	public static Map<Integer, MessageEntity> getMessengerMap() {
		return messengerMap;
	}

	public static void setMessengerMap(Map<Integer, MessageEntity> messengerMap) {
		MessengerDatabase.messengerMap = messengerMap;
	}

	public static Map<Integer, UserEntity> getUserMap() {
		return userMap;
	}

	public static void setUserMap(Map<Integer, UserEntity> userMap) {
		MessengerDatabase.userMap = userMap;
	}
}
