package org.wecancodeit.columbus.webetravelin;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.HashSet;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class State {

	// Variables
	@Id
	@GeneratedValue
	private long id;

	private String abb;
	private String stateName;
	private String motto;

	@Embedded
	private Fish fish;

	// Constructors
	public State() {
	}

	public State(String abb, String name, String motto, Fish fish, City... cities) {
		this.abb = abb;
		this.stateName = name;
		this.motto = motto;
		this.fish = fish;
		this.cities = new HashSet<>(asList(cities));
	}

	// Getters
	public long getId() {
		return id;
	}

	public String getName() {
		return stateName;
	}

	public String getMotto() {
		return motto;
	}

	public Fish getFish() {
		return fish;
	}

	public String getAbb() {
		return abb;
	}
	@JsonIgnore
	@OneToMany(mappedBy = "state")
	private Collection<City> cities;

	public Collection<City> getCities() {
		return cities;
	}

	// Formatters
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
