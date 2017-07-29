package br.com.vsg.saborapi.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.vsg.saborapi.dao.DAO;
import br.com.vsg.saborapi.enums.QueryEnum;
import br.com.vsg.saborapi.model.Stock;

@Transactional
@Repository
public class DAOImpl implements DAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void save( Object obj ) {
		entityManager.flush();
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

	@Override
	public BigDecimal getStock( Stock stock ) {
		String query = String.format( QueryEnum.SUM_STOCK.getQuery(), stock.getProductType(), stock.getFruit() );
		BigDecimal result = (BigDecimal) entityManager.createNativeQuery( query.toString() ).getSingleResult();
		return result;
	}

}
