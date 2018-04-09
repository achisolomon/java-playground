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
	Map<String, Integer> messages = null;
	Integer total_senders = 0;

	MessageMap() {
		messages = new HashMap<String, Integer>();
	}

	public void addMessageToSender(String senderAddress) {
		++total_senders;

		Integer isInMap = messages.get(senderAddress);
		if (isInMap == null) {
			messages.put(senderAddress, 1);
		} else {
			messages.put(senderAddress, ++isInMap);
		}
	}

	public List<String> getTenPrecentSenders() {
		List<String> tenPrecentList = new LinkedList<String>(); 
		
		for ( Map.Entry<String, Integer> it : messages.entrySet())
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
