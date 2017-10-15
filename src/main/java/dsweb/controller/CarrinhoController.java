package dsweb.controller;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dsweb.model.Carrinho;
import dsweb.model.Item;

@Controller
public class CarrinhoController {
	
	private final Carrinho carrinho;
	
	public CarrinhoController(Carrinho carrinho) {
	    this.carrinho = carrinho;
	  }
		
	@RequestMapping("/Carrinho")
	public String adiciona(Item item) {
	    carrinho.adcionar(item);
	    return "/home";
	  }

	
}
