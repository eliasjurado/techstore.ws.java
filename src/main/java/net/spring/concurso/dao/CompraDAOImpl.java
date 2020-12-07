package net.spring.concurso.dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.spring.concurso.entity.CompraCabecera;
import net.spring.concurso.entity.CompraDetalle;

@Repository
public class CompraDAOImpl implements CompraDAO{
	
	@Autowired
	private SessionFactory factory;

	@Transactional(readOnly = true)
	@Override
	public List<CompraDetalle> admlistAll() {
		List<CompraDetalle> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u.compra.idCompra,(select e.nomcliente from Cliente e where e.idcliente=u.compra.idCliente),(select e.apecliente from Cliente e where e.idcliente=u.compra.idCliente), u.compra.fec_ped_comp, u.compra.fec_ent_comp, (select e.desproducto from Producto e where e.idproducto=u.idProducto),u.compra.est_comp from CompraDetalle u";
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional(readOnly = true)
	@Override
	public List<CompraDetalle> listById(int id) {
		List<CompraDetalle> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select u.compra.idCompra,u.idProducto,(select e.desproducto from Producto e where e.idproducto=u.idProducto),(select e.precioProducto from Producto e where e.idproducto=u.idProducto) from CompraDetalle u where u.compra.idCompra=?1";
			query=session.createQuery(hql);
			query.setParameter(1, id);
			lista=query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public void saveCab(CompraCabecera bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateCab(CompraCabecera bean) {
		Session session=factory.getCurrentSession();
		try {
			session.update(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void saveDet(CompraDetalle bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
