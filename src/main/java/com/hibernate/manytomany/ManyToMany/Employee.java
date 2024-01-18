package com.hibernate.manytomany.ManyToMany;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
int E_id;
String E_name;
String E_Team;
	@ManyToMany
	List<Technology> tech;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int e_id, String e_name, String e_Team, List<Technology> tech) {
		super();
		this.E_id = e_id;
		this.E_name = e_name;
		this.E_Team = e_Team;
		this.tech = tech;
	}
	public int getE_id() {
		return E_id;
	}
	public void setE_id(int e_id) {
		E_id = e_id;
	}
	public String getE_name() {
		return E_name;
	}
	public void setE_name(String e_name) {
		E_name = e_name;
	}
	public String getE_Team() {
		return E_Team;
	}
	public void setE_Team(String e_Team) {
		E_Team = e_Team;
	}
	public List<Technology> getTech() {
		return tech;
	}
	public void setTech(List<Technology> tech) {
		this.tech = tech;
}
}
