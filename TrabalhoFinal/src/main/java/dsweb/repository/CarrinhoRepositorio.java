package dsweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dsweb.model.Carrinho;

@Repository
public interface CarrinhoRepositorio extends CrudRepository<Carrinho, Integer>{}
