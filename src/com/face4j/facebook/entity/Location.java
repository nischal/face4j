package com.face4j.facebook.entity;

import java.io.Serializable;

public class Location implements Serializable {

	private static final long serialVersionUID = 172082218551598833L;
	
	private String id;
	private String name;
	
	private String city;
	private String state;
	private String country;
	private String zip;
	
	private String latitude;
	private String longitude;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Double getLatitude() {
		if(this.latitude != null && !this.latitude.equals("")){
			return Double.parseDouble(this.latitude);
		}
		
		return null;
	}

	public void setLatitude(Double latitude) {
		if(latitude != null){
			this.latitude = ""+latitude;
		}
	}

	public Double getLongitude() {
		if(this.longitude != null && !this.longitude.equals("")){
			return Double.parseDouble(this.longitude);
		}
		
		return null;
	}

	public void setLongitude(Double longitude) {
		if(longitude != null){
			this.longitude = ""+longitude;
		}
	}
	
}