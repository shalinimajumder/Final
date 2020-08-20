package com.example.externalapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Countries {
	@Id
	@Column(name="Conuntries")
	 private String country;
	@Column(name="Cases")
	 private float cases;
	@Column(name="today_Cases")
	 private float todayCases;
	@Column(name="Deaths")
	 private float deaths;
	@Column(name="today_Deaths")
	 private float todayDeaths;
	@Column(name="Recovered")
	 private float recovered;
	@Column(name="today_Recovered")
	 private float todayRecovered;
	@Column(name="Active")
	 private float active;
	
	public Countries() {
		
	}

	public Countries(String country, float cases, float todayCases, float deaths, float todayDeaths, float recovered,
			float todayRecovered, float active) {
		super();
		this.country = country;
		this.cases = cases;
		this.todayCases = todayCases;
		this.deaths = deaths;
		this.todayDeaths = todayDeaths;
		this.recovered = recovered;
		this.todayRecovered = todayRecovered;
		this.active = active;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public float getCases() {
		return cases;
	}

	public void setCases(float cases) {
		this.cases = cases;
	}

	public float getTodayCases() {
		return todayCases;
	}

	public void setTodayCases(float todayCases) {
		this.todayCases = todayCases;
	}

	public float getDeaths() {
		return deaths;
	}

	public void setDeaths(float deaths) {
		this.deaths = deaths;
	}

	public float getTodayDeaths() {
		return todayDeaths;
	}

	public void setTodayDeaths(float todayDeaths) {
		this.todayDeaths = todayDeaths;
	}

	public float getRecovered() {
		return recovered;
	}

	public void setRecovered(float recovered) {
		this.recovered = recovered;
	}

	public float getTodayRecovered() {
		return todayRecovered;
	}

	public void setTodayRecovered(float todayRecovered) {
		this.todayRecovered = todayRecovered;
	}

	public float getActive() {
		return active;
	}

	public void setActive(float active) {
		this.active = active;
	}
	
	

}
