package net.spring.concurso.dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.Producto;

@Repository
public class ProductoDAOImpl implements ProductoDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Producto> listAll() {
		List<Producto> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u.idproducto, u.desproducto, u.precioProducto, u.cat.idcategoria, u.cat.nomcategoria, u.stockact from Producto u";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<Producto> admListAll() {
		List<Producto> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u.idproducto, u.desproducto, u.precioProducto, u.stockact, u.stockmin, u.cat.nomcategoria from Producto u";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional(readOnly=true)
	@Override
	public List<Producto> listById(int id) {
		Session session=factory.getCurrentSession();
		List<Producto> lista=null;
		Query query=null;
		try {
			String hql="select u.idproducto,u.desproducto,u.precioProducto,u.cat.idcategoria,u.cat.nomcategoria,u.stockact from Producto u where u.idproducto=?1";
			query=session.createQuery(hql);
			query.setParameter(1, id);
			lista=query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Transactional
	@Override
	public void save(Producto bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional
	@Override
	public void update(Producto bean) {
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
			Producto bean=session.get(Producto.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
