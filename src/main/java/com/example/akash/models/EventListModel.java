package com.example.akash.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventDetails")
public class EventListModel {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String eventName;
	String address;
	String time;
	String orginazer;
	String sponser;
	String entryfess;
	String winnerPrice;
	String playerLimit;
	
	
	
	public EventListModel(int id, String eventName, String address, String time, String orginazer, String sponser,
			String entryfess, String winnerPrice, String playerLimit) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.address = address;
		this.time = time;
		this.orginazer = orginazer;
		this.sponser = sponser;
		this.entryfess = entryfess;
		this.winnerPrice = winnerPrice;
		this.playerLimit = playerLimit;
	}
	
	public EventListModel() {
		super();
		
	}




	@Override
	public String toString() {
		return "EventListModel [id=" + id + ", eventName=" + eventName + ", address=" + address + ", time=" + time
				+ ", orginazer=" + orginazer + ", sponser=" + sponser + ", entryfess=" + entryfess + ", winnerPrice="
				+ winnerPrice + ", playerLimit=" + playerLimit + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrginazer() {
		return orginazer;
	}
	public void setOrginazer(String orginazer) {
		this.orginazer = orginazer;
	}
	public String getSponser() {
		return sponser;
	}
	public void setSponser(String sponser) {
		this.sponser = sponser;
	}
	public String getEntryfess() {
		return entryfess;
	}
	public void setEntryfess(String entryfess) {
		this.entryfess = entryfess;
	}
	public String getWinnerPrice() {
		return winnerPrice;
	}
	public void setWinnerPrice(String winnerPrice) {
		this.winnerPrice = winnerPrice;
	}
	public String getPlayerLimit() {
		return playerLimit;
	}
	public void setPlayerLimit(String playerLimit) {
		this.playerLimit = playerLimit;
	}
	
	
	
	
	
	

}
