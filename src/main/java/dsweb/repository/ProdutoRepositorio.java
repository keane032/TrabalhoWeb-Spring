package dsweb.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import dsweb.model.Produto;

@Transactional
public interface ProdutoRepositorio extends CrudRepository<Produto,Integer>{}
