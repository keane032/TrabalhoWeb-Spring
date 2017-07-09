package dsweb.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dsweb.model.Cliente;
import dsweb.model.Endereco;

@Repository
public interface EnderecoRepositorio extends CrudRepository<Endereco, Integer>{}
