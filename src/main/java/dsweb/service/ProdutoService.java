package dsweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsweb.model.Produto;
import dsweb.repository.ProdutoRepositorio;

@Service
public class ProdutoService implements dsweb.Interface.ProdutoService{

	@Autowired
	private ProdutoRepositorio repositorio;

	@Override
	public Iterable<Produto> ListAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Produto getById(int id) {
		// TODO Auto-generated method stub
		return repositorio.findOne(id);
	}

	@Override
	public Produto save(Produto produto) {
		// TODO Auto-generated method stub
		return repositorio.save(produto);
	}

	@Override
	public void dell(Integer id) {
		// TODO Auto-generated method stub
		repositorio.delete(id);
	}


	
	
	
	
}
