package org.wecancodeit.columbus.webetravelin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {
	
	@Id
	@GeneratedValue
	private long id;
	
	private String name;
	private String population;
	
	@ManyToOne
	private State state;
	
	public State getState() {
		return state;
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPopulation() {
		return population;
	}

	public City() {
		
	}

	public City(String name, String population, State state) {
		this.name = name;
		this.population = population;
		this.state = state;
	}

}
