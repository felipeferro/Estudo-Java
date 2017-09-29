package br.com.ferro.jdbc.teste;

import java.util.Calendar;

import br.com.ferro.jdbc.dao.ContatoDao;
import br.com.ferro.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Ferro");
		contato.setEmail("f@f.com.br");
		contato.setEndereco("rua do parque 153 66");
		contato.setDataNascimento(Calendar.getInstance());
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		System.out.println("Teje gravado!");

	}

}
