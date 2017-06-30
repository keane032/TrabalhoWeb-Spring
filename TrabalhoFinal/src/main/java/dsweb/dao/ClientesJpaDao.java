package dsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dsweb.model.Cliente;


@Repository
@Primary
public class ClientesJpaDao {

	@Autowired
	private EntityManager em;
	
	@Transactional
	public void adiciona(Cliente cliente){
		em.persist(cliente);
	}
	
	@Transactional(readOnly=true)
	public List<Cliente> getLista(){
		List<Cliente> result = 
				em.createQuery("from clientes",
						Cliente.class).getResultList();
		return result;
	}
	
	@Transactional(readOnly=true)
	public Cliente getProduto(Integer id){
		return em.find(Cliente.class, id);
	}
	
	
	@Transactional
	public void altera(Cliente cliente){
		em.merge(cliente);
	}
	
	
	@Transactional
	public void remove(Cliente cliente){
		em.remove(em.merge(cliente));
	}

	public boolean existe(Cliente cliente) {
		// TODO Auto-generated method stub
		if(em.contains(cliente)){
			return true;
		}
		return false;
	}
	
	
}
