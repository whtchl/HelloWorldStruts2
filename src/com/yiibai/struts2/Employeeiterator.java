package com.yiibai.struts2;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.util.SubsetIteratorFilter.Decider;

public class Employeeiterator {
	private String name;
	   private String department;

	   public Employeeiterator(){}
	   public Employeeiterator(String name,String department)
	   {
	      this.name = name;
	      this.department = department;
	   }
	   private List employees;
	   private List contractors;
		
	   public String execute() {
	      employees = new ArrayList();
	      employees.add(new Employeeiterator("George","Recruitment"));
	      employees.add(new Employeeiterator("Danielle","Accounts"));
	      employees.add(new Employeeiterator("Melissa","Recruitment"));
	      employees.add(new Employeeiterator("Rose","Accounts"));

	      contractors = new ArrayList();
	      contractors.add(new Employeeiterator("Mindy","Database"));
	      contractors.add(new Employeeiterator("Vanessa","Network"));
	      contractors.add(new Employeeiterator("Vanessa2","Network2"));
	      return "success";
	   }

	   public Decider getRecruitmentDecider() {
	      return new Decider() {
	         public boolean decide(Object element) throws Exception {
	        	 Employeeiterator employee = (Employeeiterator)element;
	            return employee.getDepartment().equals("Recruitment");
	         }
	      };
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getDepartment() {
	      return department;
	   }
	   public void setDepartment(String department) {
	      this.department = department;
	   }
	   public List getEmployees() {
	      return employees;
	   }
	   public void setEmployees(List employees) {
	      this.employees = employees;
	   }
	   public List getContractors() {
	      return contractors;
	   }
	   public void setContractors(List contractors) {
	      this.contractors = contractors;
	   }
}
