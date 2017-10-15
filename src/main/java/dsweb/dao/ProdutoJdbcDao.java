package dsweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dsweb.model.Produto;

public class ProdutoJdbcDao {

	Connection connection;
	
	public ProdutoJdbcDao() {
		this.connection=new ConnectionFactory().getConnection();
		// TODO Auto-generated constructor stub
	}
	
	

	public List<Produto> pesquisa(String pesq){
		try {
			List<Produto> produtos = new ArrayList<Produto>(); 
			Produto produto = new Produto();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM produtos WHERE nome LIKE '%?%'");
			stmt.setString(1, pesq );
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
	             produto.setNome(rs.getString("nome"));
	             produto.setValor(rs.getFloat("valor"));
	             produto.setQtd(rs.getInt("qtd")); 
	             produtos.add(produto);
	         }
	         rs.close();
	         stmt.close();
	         return produtos;
	         
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	
	
}
