package dsweb.Interface;

import dsweb.model.Carrinho;

public interface CarrinhoService {

	Carrinho getById(int id);
	Carrinho save(Carrinho carrinho);
	void dell(Integer id);
	
}
