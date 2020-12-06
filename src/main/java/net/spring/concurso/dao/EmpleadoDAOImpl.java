package net.spring.concurso.dao;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
	
	

}
