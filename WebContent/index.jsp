<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Hello World</title>
</head>
<body>
	<h1>Hello World From Struts2</h1>
	<form action="hello">
		<label for="name">Please enter your name</label><br /> <input
			type="text" name="name" /> <input type="submit" value="Say Hello" />
	</form>


	<br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>

	<form action="something">
		<label for="name">something:Please enter your name</label><br /> <input
			type="text" name="name" /> <input type="submit"
			value="something:Say Hello" />
	</form>


	<br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>

	<form action="loginaction" method="post">
		User:<br />
		<input type="text" name="user" /><br /> Password:<br />
		<input type="password" name="password" /><br /> <input type="submit"
			value="Login" />
	</form>


	<br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>文件上传
	</tr>
	 <form action="upload.action" method="post" enctype="multipart/form-data">  
        <table>  
            <tr>  
                <td>用户名:</td>  
                <td><input type="text" name="username" ></td>  
            </tr>  
            <tr>  
                <td>上传文件:</td>  
                <td><input type="file" name="myFile"></td>  
            </tr>  
            <tr>  
                <td><input type="submit" value="上传"></td>  
                <td><input type="reset"></td>  
            </tr>  
        </table>  
      </form> 
      
    <br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>验证框架
	</tr>
    <s:form action="empinfo" method="post">
        <s:textfield name="name" label="Name" size="20" />
        <s:textfield name="age" label="Age" size="20" />
        <s:submit name="submit" label="Submit" align="center" />
   </s:form>
   
   
    <br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>Struts2 类型转换
	</tr>
	<s:form action="system" method="post">
        <s:submit name="submit" label="类型转换" align="center" />
    </s:form>
   
    <br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>全局异常处理。。。
	</tr>
	<form action="testerror">
		<br />  <input type="submit"
			value="异常测试" />
	</form>
	
	<br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>注释(struts2 释解析类有问题。要更新jar包 )
	</tr>
   <s:form action="empinfozhushi" method="post">
      <s:textfield name="name" label="Name" size="20" />
      <s:textfield name="age" label="Age" size="20" />
      <s:submit name="submit" label="Submit" align="center" />
   </s:form>

   <br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>控制标签if/else
	</tr>
	   <form action="ifelse">
      <label for="name">Please pick a name</label><br/>
      <select name="name">
         <option name="Mike">Mike</option>
         <option name="Jason">Jason</option>
         <option name="Mark">Mark</option>
      </select>
      <input type="submit" value="Say Hello"/>
   </form>
   
   
      <br />
	<br />
	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>Interator 迭代器
	<a href="http://localhost:8080/HelloWorldStruts2/employeeiterator.action">Interator 迭代器</a>
	</tr>
   
 




</body>
</html>