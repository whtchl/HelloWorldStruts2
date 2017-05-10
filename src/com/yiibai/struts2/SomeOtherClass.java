package com.yiibai.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class SomeOtherClass extends ActionSupport{
	private String name;
	public String execute(){
		if ("SECRET".equals(name)) return MyAction.GOOD;
        return MyAction.BAD;
	}
}