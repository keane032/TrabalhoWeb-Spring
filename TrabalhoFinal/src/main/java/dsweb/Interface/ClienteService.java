package dsweb.Interface;

import dsweb.model.Cliente;
import dsweb.model.Produto;

public interface ClienteService {

	Iterable<Cliente> ListAll();
	Cliente getById(int id);
	Cliente save(Cliente cliente);
	void dell(Integer id);
}
