package com.yiibai.struts2;

import java.util.Comparator;

public class DepartmentComparator implements Comparator {
	public int compare(Employeeiterator e1, Employeeiterator e2) {
		System.out.println(e1.getName()+"  "+e1.getDepartment());
		System.out.println(e2.getName()+"  "+e2.getDepartment()+" /n ========== ");
		
		return e1.getDepartment().compareTo(e2.getDepartment());
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		return 0;
	}
}