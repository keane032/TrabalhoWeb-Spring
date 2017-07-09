package dsweb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.io.Serializable;

@Entity(name = "Carrinho")
public class Carrinho implements Serializable{

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcarriinho;
	
	@OneToMany
	private List<Produto> itens;
	
	@OneToOne
	private Cliente cliente;
	
	private Double total = 0.0;
	
	public List<Produto> getItens() {
		return itens;
	}
	public void setItens(List<Produto> itens) {
		this.itens = itens;
	}
	
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	public void adiciona(Produto produto){
		itens.add(produto);
	}
}
