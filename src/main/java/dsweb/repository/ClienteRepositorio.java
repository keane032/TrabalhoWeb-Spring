package dsweb.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import dsweb.model.Cliente;

@Repository
public interface ClienteRepositorio extends CrudRepository<Cliente,Integer>{}
