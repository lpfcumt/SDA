package cn.Guitars.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.Guitars.dao.GuitarDao;
import cn.Guitars.model.Guitar;

@Repository("sqliteDao")
public class SqliteDaoImpl implements GuitarDao{
	@Resource(name="sessionFactory")
	protected SessionFactory sessionFactory;
	
	//ªÒ»°session
	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		Session session;
		try {
		    session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
		    session = sessionFactory.openSession();
		}
		return session;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Guitar> findByHql(String hql) {
		// TODO Auto-generated method stub
		return this.getSession().createQuery(hql).getResultList();
	}

	
	
	@Override
	public List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteNumString(int i) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Guitar> queryAll() {
		// TODO Auto-generated method stub
		return findByHql(" from Guitar");
	}

	@Override
	public void addGuitar(Guitar model) {
		// TODO Auto-generated method stub
		this.getSession().save(model);
	}

	@Override
	public void deleteGuitar(int id) {
		// TODO Auto-generated method stub
		this.getSession().createQuery("delete from Guitar where id="+id).executeUpdate();
	}



	
}
