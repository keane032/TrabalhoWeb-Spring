package dsweb.Interface;

import dsweb.model.Produto;

public interface ProdutoService {

	Iterable<Produto> ListAll();
	Produto getById(int id);
	Produto save(Produto produto);
	void dell(Integer id);
	
}
