<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<body >
	<c:import url="cabecalho.jsp" />
	<!-- cria o DAO -->
	<jsp:useBean id="dao" class="br.com.ferro.jdbc.dao.ContatoDao" />

	<table>
		<tr bgcolor="#999">
			<td><b>Id</b></td>
			<td><b>Nome</b></td>
			<td><b>Endereço</b></td>
			<td><b>Email</b></td>
			<td><b>Data Nascimento</b></td>
		</tr>
		<!-- percorre contatos montando as linhas da tabela -->
		<c:forEach var="contato" items="${dao.lista}" varStatus="id">
			<tr bgcolor="#${id.count % 2 == 0 ? 'fff' : 'ccc' }">
				<td>${id.count}</td>
				<td>${contato.nome}</td>
				<td><c:choose>
						<c:when test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:when>
						<c:otherwise>
							E-mail não informado
						</c:otherwise>
					</c:choose></td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}"
						pattern="dd/MM/yyyy" /></td>
			</tr>
		</c:forEach>
	</table>
	<c:import url="rodape.jsp" />
</body>
</html>