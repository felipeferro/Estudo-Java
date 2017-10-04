package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ferro.jdbc.dao.ContatoDao;
import br.com.ferro.jdbc.modelo.Contato;

public class RemoveContatoLogic implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		long id = Long.parseLong(req.getParameter("id"));

		Connection connection = (Connection) req.getAttribute("conexao");

		Contato contato = new Contato();
		contato.setId(id);

		ContatoDao dao = new ContatoDao(connection);
		dao.exclui(contato);

		System.out.println("Excluindo...");
		return "mvc?logica=ListaContatosLogic";

	}

}
