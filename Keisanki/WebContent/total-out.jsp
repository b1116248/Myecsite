<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% request.setCharacterEncoding("UTF-8");%>

<% double price=Double.parseDouble(request.getParameter("price"));%>
<% double count=Double.parseDouble(request.getParameter("count")); %>
<% double keisanlist=Integer.parseInt(request.getParameter("keisanlist")); %>


<% if(keisanlist==1) {%>
	<%=price*count %>
<%}
else if(keisanlist==2) {%>
	<%=price/count %>
<%}
else if(keisanlist==3){%>
	<%=price+count %>
<%}
else if(keisanlist==4){%>
	<%=price-count %>
<%}
%>

</body>
</html>