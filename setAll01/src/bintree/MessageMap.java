package bintree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MessageMap implements Serializable {
	Map<Message, Integer> messages = null;
	Integer total_senders = 0;

	MessageMap() {
		messages = new HashMap<Message, Integer>();
	}

	public void addMessageToSender(String senderAddress , String reciver_address, String body) {
		++total_senders;
		Message msg = new Message(senderAddress, reciver_address, body);
		
		Integer isInMap = messages.get(msg);
		if (isInMap == null) {
			messages.put(msg, 1);
		} else {
			messages.put(msg, ++isInMap);
		}
	}

	public List<Message> getTenPrecentSenders() {
		List<Message> tenPrecentList = new LinkedList<Message>(); 
		
		for ( Map.Entry<Message, Integer> it : messages.entrySet())
		{
			Integer occur = it.getValue(); 
			if ( occur.floatValue() / total_senders.floatValue() > 0.1 )
			{
				tenPrecentList.add(it.getKey());
			}
		}
		return tenPrecentList;
	}

}
