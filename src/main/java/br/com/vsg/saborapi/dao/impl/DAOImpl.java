package br.com.vsg.saborapi.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.vsg.saborapi.dao.DAO;
import br.com.vsg.saborapi.enums.QueryEnum;

@Transactional
@Repository
public class DAOImpl implements DAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void save( Object obj ) {
		entityManager.persist( obj );
	}

	@Override
	public void update( Object obj ) {
		entityManager.merge( obj );
	}

	public Object getById( Class c, int objId ) {
		return entityManager.find( c, objId );
	}

	@Override
	public void delete( Object obj ) {
		obj = entityManager.merge( obj );
		entityManager.remove( obj );
	}

	@Override
	public List<Object> getAll( Class c ) {
		String query = String.format( QueryEnum.SELECT_ALL_FROM.getQuery(), c.getSimpleName() );
		return (List<Object>) entityManager.createQuery( query ).getResultList();
	}

}
