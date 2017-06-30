package dsweb.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dsweb.model.Produto;


@Repository
@Primary
public class ProdutoJpaDao {

	@Autowired
	private EntityManager em;
	
	@Transactional
	public void adiciona(Produto produto) {
		em.persist(produto);
	}


	@Transactional(readOnly=true)
	public List<Produto> getLista() {
		List<Produto> result = 
				em.createQuery("from produtos", 
				Produto.class).getResultList();
		return result;
	}
	
	@Transactional(readOnly=true)
	public Produto getProduto(Integer id) {
		return em.find(Produto.class, id);
	}
	

	@Transactional
	public void altera(Produto produto) {
		em.merge(produto);
	}
	

	@Transactional
	public void remove(Produto produto) {
		em.remove(em.merge(produto));
	}


}
