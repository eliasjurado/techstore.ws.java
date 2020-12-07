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
import net.spring.concurso.entity.Empleado;

@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO{
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional(readOnly = true)
	@Override
	public List<Empleado> listAll() {
		List<Empleado> lista=null;
		Query query=null;
		Session session=factory.getCurrentSession();
		try {
			String hql="select e.idempleado, e.nomempleado, e.apeempleado, e.dniempleado, e.tlfempleado, e.direcempleado,(select d.nomdistrito from Distrito d where d.iddistrito=e.iddistrito),(select c.nomcargo from Cargo c where c.idcargo=e.idcargo),e.emailempleado, e.passempleado, (select t.nomtipousuario from TipoUsuario t where t.idtipousuario=e.idtipousuario)  from Empleado e";
			//select  
		    //e.idEmpleado, e.nomEmpleado, e.apeEmpleado, e.dniEmpleado, e.tlfEmpleado, e.direcEmpleado,  
		    //d.nomDistrito, c.nomCargo, e.emailEmpleado, e.passEmpleado, tp.nomTipoUsuario  
		    //from Empleado
			query=session.createQuery(hql);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return query.getResultList();
	}

	@Transactional
	@Override
	public void save(Empleado bean) {
		Session session=factory.getCurrentSession();
		try {
			session.save(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Transactional
	@Override
	public void update(Empleado bean) {
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
			Empleado bean=session.get(Empleado.class, cod);
			session.delete(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Transactional(readOnly=true)
	@Override
	public Empleado loginEmpleado(String email, String pass) {
		Session session=factory.getCurrentSession();
		Empleado bean=null;
		Query query=null;
		try {
			String hql="select u from Empleado u where u.emailempleado=?1 and u.passempleado=?2";
			query=session.createQuery(hql);
			query.setParameter(1, email);
			query.setParameter(2, pass);
			List<Empleado> lista=query.getResultList();
			//validar
			if(!lista.isEmpty())
				bean=(Empleado) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
