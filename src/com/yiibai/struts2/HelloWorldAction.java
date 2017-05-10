package com.yiibai.struts2;

import com.opensymphony.xwork2.ActionSupport;

class MyAction extends ActionSupport{
	public static String GOOD = SUCCESS;
	public static String BAD  = ERROR;
}
public class HelloWorldAction extends ActionSupport {
	  
	private String name;
	  
	public String execute(){
		 System.out.println("Inside action....");
		 return "success";
		/*if("SECRET".equals(name)) return MyAction.GOOD;
		else return MyAction.ERROR;*/
	}
	   /*public String execute() throws Exception {
		   if("SECRET".equals(name)){
			   return "success";
		   }else{
			   return ERROR;
		   }
	      
	   }*/
	   
	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}

