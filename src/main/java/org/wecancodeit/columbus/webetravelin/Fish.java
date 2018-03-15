package org.wecancodeit.columbus.webetravelin;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Entity
@Embeddable
public class Fish {
	
//	@Id
//	@GeneratedValue
//	private long id;
	private String imageUrl;
	private String latin;
	private String fishName;
	
//	private State state;


//	public long getId() {
//		return id;
//	}


	public String getImageUrl() {
		return imageUrl;
	}


	public String getLatin() {
		return latin;
	}


	public String getName() {
		return fishName;
	}
	
	public Fish () {
		
	}


	public Fish(String name, String latin, String imageUrl) {
		this.fishName = name;
		this.latin = latin;
		this.imageUrl = imageUrl;
	}


//	public State getState() {
//		return state;
//	}
	
	

}
