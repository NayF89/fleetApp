package com.springBoot.fleetApp.model;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/* Superclass
 * Abstract class with no instantiated objects. 
 * No tables will be created. 
 * Use only for the purpose of inheritance from other classes.
*/

@MappedSuperclass
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class)
public class CommonObject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	public CommonObject(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	public CommonObject() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "CommonObject [id=" + id + ", description=" + description + "]";
	}
	
	
	
}
