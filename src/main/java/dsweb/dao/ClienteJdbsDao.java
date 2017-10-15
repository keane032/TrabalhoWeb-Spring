package dsweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dsweb.model.Cliente;

public class ClienteJdbsDao {

	
	
	Connection connection;
	
	public ClienteJdbsDao() {
		this.connection= new ConnectionFactory().getConnection();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Cliente getclienteByEmail(String email){
		try {
			Cliente cliente = new Cliente();
			PreparedStatement stmt = this.connection.prepareStatement("select * from clientes where login=?");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				cliente.setId(rs.getInt("id"));
				cliente.setNome(rs.getString("nome"));
				cliente.setEndereco(rs.getString("endereco"));
				cliente.setLogin(rs.getString("login"));
				cliente.setSenha(rs.getString("senha"));
			}
			rs.close();
			stmt.close();
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	
	
}
