package net.spring.concurso.dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> listAll() {
		List<Cliente> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u.idcliente,u.nomcliente,u.apecliente,u.dnicliente,u.tlfcliente, u.direccliente,(select d.nomdistrito from Distrito d where d.iddistrito=u.iddistrito),  u.emailcliente, u.passcliente from Cliente u";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}
	
	@Transactional(readOnly=true)
	@Override
	public Cliente loginCliente(String email, String pass) {
		Session session=factory.getCurrentSession();
		Cliente bean=null;
		Query query=null;
		try {
			String hql="select u from Cliente u where u.emailcliente=?1 and u.passcliente=?2";
			query=session.createQuery(hql);
			query.setParameter(1, email);
			query.setParameter(2, pass);
			List<Cliente> lista=query.getResultList();
			//validar
			if(!lista.isEmpty())
				bean=(Cliente) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
}
