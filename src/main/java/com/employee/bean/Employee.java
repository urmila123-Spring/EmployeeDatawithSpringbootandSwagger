package com.employee.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="EMPLOYEE")
public class Employee {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	@Column
	private String name;
	
	@Column
	private String  Swipein;
	@Column
    private String  Swipeout;
	@Column
	private Date date;
	@Column
	private String LocationName;
	public String getSwipein() {
		return Swipein;
	}
	public void setSwipein(String swipein) {
		Swipein = swipein;
	}
	public String getSwipeout() {
		return Swipeout;
	}
	public void setSwipeout(String swipeout) {
		Swipeout = swipeout;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getLocationName() {
		return LocationName;
	}
	public void setLocationName(String locationName) {
		LocationName = locationName;
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Swipein=" + Swipein + ", Swipeout=" + Swipeout + ", date="
				+ date + ", LocationName=" + LocationName + "]";
	}
}
	