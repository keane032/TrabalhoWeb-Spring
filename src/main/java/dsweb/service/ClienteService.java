package dsweb.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dsweb.model.Cliente;
import dsweb.repository.ClienteRepositorio;

@Service
public class ClienteService implements dsweb.Interface.ClienteService{

	@Autowired
	private ClienteRepositorio repositorio;
	
	@Override
	public Cliente getById(int id) {
		// TODO Auto-generated method stub
		return repositorio.findOne(id);
	}
	
	@Override
	public Iterable<Cliente> ListAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return repositorio.save(cliente);
	}

	@Override
	public void dell(Integer id) {
		// TODO Auto-generated method stub
		repositorio.delete(id);
	}
	
	
	
}
