package com.example.demo;

public class DataStoringClass {
	
	private String state;
	private String country;
	private int MostRecentTotalCases;
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state.isEmpty()) this.state = "NA";
		else this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		if(country.isEmpty()) this.country = "NA";
		else this.country = country;
	}
	public int getMostRecentTotalCases() {
		return MostRecentTotalCases;
	}
	public void setMostRecentTotalCases(int mostRecentTotalCases) {
		MostRecentTotalCases = mostRecentTotalCases;
	}
	@Override
	public String toString() {
		return "DataStoringClass [state=" + state + 
			   ", country=" + country + 
			   ", MostRecentTotalCases=" + MostRecentTotalCases + "]";
	}
	
	 

}
