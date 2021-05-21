package com.springBoot.fleetApp.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Employee extends Person {
		
	@ManyToOne
	@JoinColumn(name="employeetypeid", insertable=false, updatable=false)
	private EmployeeType employeeType;
	private Integer employeetypeid;
	
	@ManyToOne
	@JoinColumn(name="jobtitleid", insertable=false, updatable=false)
	private JobTitle jobTitle;
	private Integer jobtitleid;
	public Employee(Integer id, String name, String gender, String maritalStatus, Country country, Integer countryid,
			State state, Integer stateid, EmployeeType employeeType, Integer employeetypeid, JobTitle jobTitle,
			Integer jobtitleid) {
		super(id, name, gender, maritalStatus, country, countryid, state, stateid);
		this.employeeType = employeeType;
		this.employeetypeid = employeetypeid;
		this.jobTitle = jobTitle;
		this.jobtitleid = jobtitleid;
	}
	public Employee(Integer id, String name, String gender, String maritalStatus, Country country, Integer countryid,
			State state, Integer stateid) {
		super(id, name, gender, maritalStatus, country, countryid, state, stateid);
	}
	
	public Employee() {
		super();
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	public Integer getEmployeetypeid() {
		return employeetypeid;
	}
	public void setEmployeetypeid(Integer employeetypeid) {
		this.employeetypeid = employeetypeid;
	}
	public JobTitle getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Integer getJobtitleid() {
		return jobtitleid;
	}
	public void setJobtitleid(Integer jobtitleid) {
		this.jobtitleid = jobtitleid;
	}
	
	

}
