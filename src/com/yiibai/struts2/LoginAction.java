package com.yiibai.struts2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport {
	  private String user;
	  private String password;
	  private String name;
	  
/*	  
	  dataSource2.driver=com.mysql.jdbc.Driver
	  dataSource2.url=jdbc:mysql://192.168.1.200:3306/huitouke_v41?autoReconnect=true&useUnicode=true&characterEncoding=utf-8&mysqlEncoding=utf8&zeroDateTimeBehavior=convertToNull
	  dataSource2.username=huitouke_v41
	  dataSource2.password=whlshLwhy2882lLH*/

	  
	  
	  
	  public String execute() {
	      String ret = ERROR;
	      Connection conn = null;
	      System.out.println("user:"+user);
	         System.out.println("password:"+password);
	      try {
	    	  System.out.println("0");
	         String URL = "jdbc:mysql://localhost:3306/struts_tutorial";
	         System.out.println("0-1");
	         Class.forName("com.mysql.jdbc.Driver");
	         System.out.println("1");
	         conn = DriverManager.getConnection(URL, "root", "111111");
	         System.out.println("2");
	         String sql = "SELECT name FROM login WHERE";
	         sql+=" user = ? AND password = ?";
	         PreparedStatement ps = conn.prepareStatement(sql);
	         System.out.println("3");
	         System.out.println("user:"+user);
	         System.out.println("password:"+password);
	         ps.setString(1, user);
	         ps.setString(2, password);
	         System.out.println("sql:"+ps.toString());
	         ResultSet rs = ps.executeQuery();

	         while (rs.next()) {
	            name = rs.getString(1);
	            System.out.println("name:"+name);
	            ret = SUCCESS;
	         }
	      } catch (Exception e) {
	    	 System.out.println("error:");
	         ret = ERROR;
	      } finally {
	         if (conn != null) {
	            try {
	               conn.close();
	            } catch (Exception e) {
	            }
	         }
	      }
	      return ret;
	   }

	   public String getUser() {
	      return user;
	   }

	   public void setUser(String user) {
	      this.user = user;
	   }

	   public String getPassword() {
	      return password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
}
