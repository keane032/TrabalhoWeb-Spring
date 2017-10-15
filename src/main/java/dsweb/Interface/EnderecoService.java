package dsweb.Interface;

import dsweb.model.Endereco;

public interface EnderecoService {


	Iterable<Endereco> ListAll();
	Endereco getById(int id);
	Endereco save(Endereco endereco);
	void dell(Integer id);
	
}
