package org.wecancodeit.columbus.webetravelin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class State {
	
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	private String abb;
	
	public State() {}

	public State(String abb) {
		this.abb = abb;
	}

	public String getAbb() {
		return abb;
	}
 
	@Override
	public int hashCode() {
		return ((Long) id).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		return id == ((State) obj).id;
	}
	

}
