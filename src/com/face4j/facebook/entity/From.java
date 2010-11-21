package com.face4j.facebook.entity;

import java.io.Serializable;

public class From implements Serializable{
	
	private static final long serialVersionUID = -3428384342557008840L;

	private String id;
	private String name;
	
	public From(String id, String name){
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

}
