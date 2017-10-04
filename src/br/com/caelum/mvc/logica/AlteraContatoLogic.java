package br.com.caelum.mvc.logica;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.ferro.jdbc.dao.ContatoDao;
import br.com.ferro.jdbc.modelo.Contato;

public class AlteraContatoLogic implements Logica {

	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {

		long id = Long.parseLong(req.getParameter("id"));

		Contato contato = new Contato();
		contato.setId(id);

		Connection connection = (Connection) req.getAttribute("conexao");

		ContatoDao dao = new ContatoDao(connection);
		dao.altera(contato);

		System.out.println("Alterando contato... ");

		return "mvc?logica=ListaContatosLogic";
	}

}
