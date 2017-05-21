<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title>Employees</title>
</head>
<body>

	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>Interator 
<b>Example of Iterator Tag</b><br/>
<s:iterator value="employees">
	<s:property value="name"/> , 
	<s:property value="department"/><br/>
</s:iterator>
<br/><br/>
<b>Employees sorted by Department</b><br/>

<s:bean name="com.yiibai.struts2.DepartmentComparator" 
   var="deptComparator" />

<s:sort comparator="deptComparator" source="employees">
   <s:iterator>
      <s:property value="name"/>
      <s:property value="department"/><br/>
   </s:iterator>
</s:sort>



<br/><br/>
<b>SubSet Tag - Employees working in Recruitment department </b><br/>
<s:subset decider="recruitmentDecider" source="employees">
   <s:iterator>
      <s:property value="name"/> , 
      <s:property value="department"/><br/>
   </s:iterator>
</s:subset>



<br/><br/>
<b>SubSet Tag - Employees 2 and 3 </b><br/>
<s:subset start="1" count="2" source="employees">
   <s:iterator>
      <s:property value="name"/> , 
      <s:property value="department"/><br/>
   </s:iterator>
</s:subset>

	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr>  Merged ： 假设你有A和B两个列表，值为A1，A2和B1，B2。合并列表将得出A1，B1，A2，B2
   <br />
   <s:merge id="allemployees">
      <s:param value="employees" />
      <s:param value="contractors" />
   </s:merge>
   <s:iterator value="allemployees">
      <s:property value="name"/>,
      <s:property value="department"/><br/>
   </s:iterator>
   
   
   	<br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr> append：假设你有A和B两个列表，值为A1，A2和B1，B2。附加列表将给你得出A1，A2，B1，B2。
   <br />
   <s:append  id="allemployees">
      <s:param value="employees" />
      <s:param value="contractors" />
   </s:append >
   <s:iterator value="allemployees">
      <s:property value="name"/>,
      <s:property value="department"/><br/>
   </s:iterator>
   
   <br />
	<HR style="border: 3 double #987cb9" width="100%" color=#987cb9 SIZE=3>
	<tr> Generator
   <br />
   
   <h2>Example of Generator Tag</h2>
   <h3>The colours of rainbow:</h3>

<s:generator val="%{'Violet,Indigo,Blue,
         Green,Yellow,Orange,Red '}" count="7" 
         separator=",">
   <s:iterator>
      <s:property /><br/>
   </s:iterator>
</s:generator>	
</body>
</html>