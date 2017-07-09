package dsweb.service;


import org.springframework.beans.factory.annotation.Autowired;

import dsweb.model.Carrinho;
import dsweb.repository.CarrinhoRepositorio;

public class CarrinhoService implements dsweb.Interface.CarrinhoService{

	@Autowired
	private CarrinhoRepositorio repositorio;
	
	@Override
	public Carrinho getById(int id) {
		// TODO Auto-generated method stub
		return repositorio.findOne(id);
	}

	@Override
	public Carrinho save(Carrinho carrinho) {
		// TODO Auto-generated method stub
		return repositorio.save(carrinho);
	}

	@Override
	public void dell(Integer id) {
		// TODO Auto-generated method stub
		repositorio.delete(id);
	}

}
