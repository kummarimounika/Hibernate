package com.hibernate.manytomany.ManyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Technology {
@Id
int T_id;
String T_name;
@ManyToMany
List<Employee> em;
public Technology() {
	super();
	// TODO Auto-generated constructor stub
}
public Technology(int t_id, String t_name, List<Employee> em) {
	super();
	this.T_id = t_id;
	this.T_name = t_name;
	this.em = em;
}
public int getT_id() {
	return T_id;
}
public void setT_id(int t_id) {
	T_id = t_id;
}
public String getT_name() {
	return T_name;
}
public void setT_name(String t_name) {
	T_name = t_name;
}
public List<Employee> getEm() {
	return em;
}
public void setEm(List<Employee> em) {
	this.em = em;
}

}
