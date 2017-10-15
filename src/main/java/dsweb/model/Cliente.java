package dsweb.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import dsweb.model.Endereco;

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
	@PrimaryKeyJoinColumn
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String login;
	
	
	@NotNull
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String Senha;


	@NotNull
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String endereco;
//	@ManyToOne
//	private Endereco endereco;

	
	public Cliente() {
		
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


//	public Endereco getEndereco() {
//		return endereco;
//	}
//
//
//	public void setEndereco(Endereco endereco) {
//		this.endereco = endereco;
//	}
//

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	
	
}
