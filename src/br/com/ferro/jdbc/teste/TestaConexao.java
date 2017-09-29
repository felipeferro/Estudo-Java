package br.com.ferro.jdbc.teste;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.ferro.jdbc.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
	}
}
