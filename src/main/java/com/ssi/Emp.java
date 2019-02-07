package com.ssi;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
	private int ecode;
	private String ename;
	private String desg;
	private int sal;
	
	@ManyToMany
	private List<Area> areas;
	
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public Emp(int ecode, String ename, String desg, int sal) {
		super();
		this.ecode = ecode;
		this.ename = ename;
		this.desg = desg;
		this.sal = sal;
		
	}
	public Emp(int ecode) {
		super();
		this.ecode = ecode;
	}
	public Emp() {
		super();
	}
	@Override
	public String toString() {
		return "Emp [ecode=" + ecode + ", ename=" + ename + ", desg=" + desg
				+ ", sal=" + sal + "]";
	}
					 							
	
	
}
