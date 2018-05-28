package com.niit.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="MyEmpSukan")
public class EmployeeInfo {
	@Id 
	private int    roll_no;
	private String name;
	public EmployeeInfo() {
	}
	public EmployeeInfo(String name, int roll_no) {
		this.name    = name;
		this.roll_no = roll_no;
	}
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
