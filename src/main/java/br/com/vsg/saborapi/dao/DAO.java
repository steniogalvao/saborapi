package br.com.vsg.saborapi.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.vsg.saborapi.model.Stock;

@Transactional
@Repository
public interface DAO {

	void save( Object obj );

	void update( Object obj );

	Object getById( Class c, int objId );

	void delete( Object obj );

	List<Object> getAll( Class c );

	BigDecimal getStock( Stock stock );

}
