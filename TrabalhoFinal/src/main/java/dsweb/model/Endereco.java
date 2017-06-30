package dsweb.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import dsweb.model.Cliente;

@Entity(name = "Endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEndereco;
	@NotNull 
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String Rua;
	@NotNull 
	@Size(min=5,max=50, message="O tamanho deve ser entre {min} e {max}")
	private String numeCasa;
	
	
	@OneToMany
	@JoinColumn(name = "idcliente")
	private Collection<Cliente> cliente;
	
	
	public Integer getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getRua() {
		return Rua;
	}
	public void setrua(String nomeRua) {
		this.Rua = nomeRua;
	}
	public String getNumeCasa() {
		return numeCasa;
	}
	public void setNumeCasa(String numeCasa) {
		this.numeCasa = numeCasa;
	}
	public Collection<Cliente> getCliente() {
		return cliente;
	}
	public void setCliente(Collection<Cliente> cliente) {
		this.cliente = cliente;
	}
	
	
	
}
