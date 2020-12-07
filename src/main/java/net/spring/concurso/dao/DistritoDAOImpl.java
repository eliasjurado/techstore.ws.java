package net.spring.concurso.dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Cliente;
import net.spring.concurso.entity.Distrito;

@Repository
public class DistritoDAOImpl implements DistritoDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Distrito> listAll() {
		List<Distrito> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u from Distrito u";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional
	@Override
	public void save(Distrito bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional
	@Override
	public void update(Distrito bean) {
		Session session=factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	@Transactional
	@Override
	public void delete(int cod) {
		Session session=factory.getCurrentSession();
		try {
			Distrito bean=session.get(Distrito.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
