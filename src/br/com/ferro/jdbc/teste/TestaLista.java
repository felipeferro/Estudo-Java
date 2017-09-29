package br.com.ferro.jdbc.teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.ferro.jdbc.dao.ContatoDao;
import br.com.ferro.jdbc.modelo.Contato;


public class TestaLista {

	public static void main(String[] args) {
		SimpleDateFormat fb = new SimpleDateFormat("dd/MM/yyyy");
		
		ContatoDao dao = new ContatoDao();
		List<Contato> contatos = dao.getLista();

		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Nascimento: " + fb.format(contato.getDataNascimento().getTime()) + "\n");
		}
	}
}
