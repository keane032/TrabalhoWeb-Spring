package dsweb.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name="clientes")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull 
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String nome;
	
	@NotNull
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String login;
	
	
	@NotNull
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String Senha;


	@ManyToOne
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	
	public Endereco getAddresses() {
		return this.endereco;
	}


	public Integer getId() {
		return id;
	}


	public void setId(int idCliente) {
		this.id = idCliente;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return Senha;
	}


	public void setSenha(String senha) {
		Senha = senha;
	}
	
	
	
	
}
