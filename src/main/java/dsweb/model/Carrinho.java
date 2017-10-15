package dsweb.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Carrinho {

	private ArrayList<Item> carrinho = new ArrayList<Item>();
	
	private double total = 0.0;
	
	

	public void adcionar(Item item){
		carrinho.add(item);
		total += item.getProduto().getValor() * item.getQtd();
	}
	
	public Integer getTotalDeItens() {
	    return carrinho.size();
	  }
	
	public ArrayList<Item> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Item> carrinho) {
		this.carrinho = carrinho;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double valorTotal) {
		total = valorTotal;
	}

	
}
