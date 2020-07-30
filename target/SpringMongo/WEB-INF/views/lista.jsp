<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Pessoas</title>
</head>
<body>
		<h1 align="center">Listagem dos Dados</h1>
		<table align="center" border="4">
		<tr bgcolor="gray">
		    <th>ID</th>
			<th>Nome</th>
			<th>Idade</th>
			<th>Profissão</th>
			<!--  <th>Endere�o</th>-->
			<th>Cidade</th>
			<th>Bairro</th>
			<th>Estado</th>
			<th>Jugs</th>
			<th>Data</th>
			<th>Editar</th>
			<th>Deletar</th>
		</tr>
		<c:forEach items="${list}" var="devices">
			<tr>
				<td>${devices._id}</td>
                <td>${devices.deviceName}</td>
				<td>${devices.name}</td>
				<td>${devices.description}</td>
                <td>${devices.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
