package dsweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dsweb.model.Endereco;
import dsweb.repository.EnderecoRepositorio;

@Service
public class EnderecoService implements dsweb.Interface.EnderecoService{

	@Autowired
	private EnderecoRepositorio repositorio;

	@Override
	public Iterable<Endereco> ListAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Endereco getById(int id) {
		// TODO Auto-generated method stub
		return repositorio.findOne(id);
	}

	@Override
	public Endereco save(Endereco endereco) {
		// TODO Auto-generated method stub
		return repositorio.save(endereco);
	}

	@Override
	public void dell(Integer id) {
		// TODO Auto-generated method stub
		repositorio.delete(id);
	}
	


}
