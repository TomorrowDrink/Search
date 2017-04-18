<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<div class="image">
<img src="symbol.png" alt="搜索图标" >
</div>

<div class="main">
	<form action="SearchServlet" method="post" >
	    <input type="text" name="search">
	    <input type="button" value="search">
		    <br> <br>
		    
		     <span>left</span>
		    <select name="left">
		    <option value="baidu" selected>baidu</option>
		    <option value="sougou">sogou</option>
		    </select>
		    &nbsp
		    <span>right</span>
		    <select name="right">
		     <option value="sougou" selected>sogou</option>
		    <option value="baidu" >baidu</option>
		    </select>
	</form>
	<%
	String leftweb = (String)request.getAttribute("left");
	String rightweb = (String)request.getAttribute("right");
	%>
	
	<iframe src="<%=leftweb %>" frameborder="0" ></iframe>
	<iframe src="<%=rightweb %>" frameborder="0" ></iframe>
</div>

</body>
</html>