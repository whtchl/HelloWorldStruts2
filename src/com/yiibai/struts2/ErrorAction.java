package com.yiibai.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class ErrorAction extends ActionSupport {
	  private String name;

	   public String execute(){
	      String x = null;
	      x = x.substring(0);
	      return SUCCESS;
	   }
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
