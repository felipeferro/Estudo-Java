<%@page import="java.text.SimpleDateFormat"%>
<%@ page
	import="java.util.*, br.com.ferro.jdbc.dao.*, br.com.ferro.jdbc.modelo.*"%>
<html>
<body>
	<table>
		<tr>
			<td><b>Nome</b></td>
			<td><b>Endereço</b></td>
			<td><b>Email</b></td>
			<td><b>Data Nascimento</b></td>
		</tr>
		<%
			ContatoDao dao = new ContatoDao();
			List<Contato> contatos = dao.getLista();

			for (Contato contato : contatos) {
		%>
		<tr>
			<td><%=contato.getNome()%></td>
			<td><%=contato.getEndereco()%></td>
			<td><%=contato.getEmail()%></td>
			<td>
				<%
					SimpleDateFormat fb = new SimpleDateFormat("dd/MM/yyyy");
				%> <%=fb.format(contato.getDataNascimento().getTime())%>
			</td>
		</tr>

		<%
			}
		%>
	</table>
</body>
</html>