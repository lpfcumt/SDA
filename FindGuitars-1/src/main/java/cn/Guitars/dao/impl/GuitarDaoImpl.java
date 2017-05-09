package cn.Guitars.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.Guitars.dao.GuitarDao;
import cn.Guitars.model.Guitar;
@Repository("guitarDao")
public class GuitarDaoImpl extends BaseDaoImpl<Guitar> implements GuitarDao{

	@Override
	public List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type) {
		// TODO Auto-generated method stub
		return findByHql("from guitar where backwood='"+backwood+"' and builder='"+builder+"' and model='"+model+
				"' and numstrings="+numstrings+"and topwood='"+topwood+"' and type='"+type+"'");
	}

}
