<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>計算Keisan.java画面</title>
</head>
<body>
<form method="post" action="total-out.jsp">

	<p>xの値を入力してください</p>
	<input type="text" name="price">

<p>yの値を入力してください</p>
	<input type="text" name="count">

<p>計算方法を選択して下さい</p>
	 <select name="keisanlist">
			<option value="1">×</option>
			<option value="2">÷</option>
			<option value="3">+</option>
			<option value="4">-</option>
	</select>
<br><br>
	<input type="submit" value="計算">

</form>
</body>
</html>