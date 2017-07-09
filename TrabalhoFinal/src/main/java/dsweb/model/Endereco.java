package dsweb.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String Num;	
//	@OneToMany
//	private Collection<Cliente> cliente;
//	
//	
	public Endereco() {}
	
	
	
	public Integer getId() {
		return idEndereco;
	}
	public void setId(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String num) {
		Num = num;
	}
//	public Collection<Cliente> getCliente() {
//		return cliente;
//	}
//	public void setCliente(Collection<Cliente> cliente) {
//		this.cliente = cliente;
//	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
}
