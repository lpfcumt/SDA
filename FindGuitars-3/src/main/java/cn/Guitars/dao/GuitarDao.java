package cn.Guitars.dao;

import java.util.List;

import org.hibernate.Session;

import cn.Guitars.model.Guitar;

public interface GuitarDao {
	
	public Session getSession();

	List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type);

	void deleteNumString(int i);
	
	List<Guitar> queryAll();
	
	List<Guitar> findByHql(String hql);

	public void addGuitar(Guitar model);

	public void deleteGuitar(int id);

}
