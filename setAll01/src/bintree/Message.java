package bintree;

import java.io.Serializable;

/**
 * @author achisolomon
 *
 */
public class Message implements Serializable {

	private String sender_address = null;
	private String reciver_address = null;
	private String body = null;

	public String getSender_address() {
		return sender_address;
	}

	public void setSender_address(String sender_address) {
		this.sender_address = sender_address;
	}

	public String getReciver_address() {
		return reciver_address;
	}

	public void setReciver_address(String reciver_address) {
		this.reciver_address = reciver_address;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	/*
	 * use the sender field for equals.
	 * 
	 */
	@Override
	public boolean equals(Object arg0) {
		return sender_address.equals(((Message) arg0).getSender_address());
	}

	/*
	 * use the sender field as the key.
	 */
	@Override
	public int hashCode() {
		return sender_address.hashCode();
	}

	public Message(String sender_address, String reciver_address, String body) {
		super();
		this.sender_address = sender_address;
		this.reciver_address = reciver_address;
		this.body = body;
	}
	
	public String toString() { 
		return null;
	}
	

}
