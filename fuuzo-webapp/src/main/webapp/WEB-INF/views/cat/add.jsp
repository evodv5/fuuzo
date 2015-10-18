<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dodaj kota</title>
	</head>
	<body>
		<a href="../cat">Powrót do listy kotów</a><br />
		<form:form method="POST" modelAttribute="catDTO">
			<table border="1">
				<tbody>
					<tr>
						<th>Imię</th>
						<td><form:input type="text" path="name" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="name" /></c:if></td>
					</tr>
					<tr>
						<th>Data urodzenia</th>
						<td><form:input type="text" path="dateOfBirth" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="dateOfBirth" /></c:if></td>
					</tr>
					<tr>
						<th>Waga</th>
						<td><form:input type="text" path="weight" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="weight" /></c:if></td>
					</tr>
					<tr>
						<th>Imię opiekuna</th>
						<td><form:input type="text" path="guardian" /><c:if test="${pageContext.request.method=='POST'}"><form:errors path="guardian" /></c:if></td>
					</tr>
					<tr>
						<td colspan="2" align="right"><input type="submit" value="Dodaj!" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
		<br />
		<hr />
		Uwaga! W kontekście użycia HTML oraz sposobu budowania stron, te rozwiązania są bardziej antyprzykładem niż materiałem do nauki!<br />
		Jeśli chciałabyś także tworzyć same widoki i pisac poprawny, dobrze skonstruowany kod HTML, zachęcamy do zapoznania się np. z frameworkiem <a href="http://getbootstrap.com" target="_blank">Bootstrap</a>.
	</body>
</html>