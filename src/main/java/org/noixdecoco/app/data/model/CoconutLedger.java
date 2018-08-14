package org.noixdecoco.app.data.model;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coconutledgers")
public class CoconutLedger {
	
	@Id
	private ObjectId id;
	
	private String username; // Owner of this ledger
	
	private Long numberOfCoconuts; // Number of coconuts received total
	
	private Long coconutsGiven;
	
	private Date lastCoconutGivenAt;
	
	public CoconutLedger() {
		
	}
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getNumberOfCoconuts() {
		return numberOfCoconuts;
	}

	public void setNumberOfCoconuts(Long numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	public String toString() {
		return "CoconutLedger: [username=" + username + ", coconuts=" + numberOfCoconuts + "]";
	}
	
	public Long getCoconutsGiven() {
		return coconutsGiven;
	}

	public void setCoconutsGiven(Long coconutsGiven) {
		this.coconutsGiven = coconutsGiven;
	}

	public Date getLastCoconutGivenAt() {
		return lastCoconutGivenAt;
	}

	public void setLastCoconutGivenAt(Date lastCoconutGivenAt) {
		this.lastCoconutGivenAt = lastCoconutGivenAt;
	}

	public static CoconutLedger createNew() {
		CoconutLedger ledger = new CoconutLedger();
		ledger.setId(new ObjectId());
		ledger.setCoconutsGiven(0l);
		ledger.setNumberOfCoconuts(0l);
		
		return ledger;
	}

}