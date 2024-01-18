package com.hibernate.manytomany.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
	 public static void main( String[] args )  throws Exception{
		    Technology t1=new Technology();
		    Technology t2=new Technology();
		    Technology t3=new Technology();
		    Technology t4=new Technology();
		    
		    List<Technology> list1=new ArrayList<Technology>();
		    List<Technology> list2=new ArrayList<Technology>();
		    List<Technology> list3=new ArrayList<Technology>();
		    List<Technology> list4=new ArrayList<Technology>();
		   
		    
		    Employee  em1=new Employee();
		    Employee  em2=new Employee();
		    Employee  em3=new Employee();
		    Employee  em4=new Employee();
		    Employee  em5=new Employee();
		    Employee  em6=new Employee();
		    
		    List<Employee> list5=new ArrayList<Employee>();
		    List<Employee> list6=new ArrayList<Employee>();
		    List<Employee> list7=new ArrayList<Employee>();
		    List<Employee> list8=new ArrayList<Employee>();
		  		    
		  
		   Configuration cfg = new Configuration().configure();
		   SessionFactory factory = cfg.buildSessionFactory();
		   Session session = factory.openSession();
		   Transaction trans = session.beginTransaction();

		   System.out.println("Objects are saved");

    }
}
