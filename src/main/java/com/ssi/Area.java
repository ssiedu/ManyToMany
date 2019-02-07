package com.ssi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Area {
	@Id
	private String acode;
	private String adesc;
	private String city;
	private String state;
	
	@ManyToMany(mappedBy="areas")
	private List<Emp> emps;
	
	
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	public String getAcode() {
		return acode;
	}
	public void setAcode(String acode) {
		this.acode = acode;
	}
	public String getAdesc() {
		return adesc;
	}
	public void setAdesc(String adesc) {
		this.adesc = adesc;
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
	public Area(String acode, String adesc, String city, String state) {
		super();
		this.acode = acode;
		this.adesc = adesc;
		this.city = city;
		this.state = state;
	}
	public Area(String acode) {
		super();
		this.acode = acode;
	}
	public Area() {
		super();
	}
	@Override
	public String toString() {
		return "Area [acode=" + acode + ", adesc=" + adesc + ", city=" + city
				+ ", state=" + state + "]";
	}
	
}
