package cn.Guitars.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.Guitars.domain.Inventory;
import cn.Guitars.dao.GuitarDao;
import cn.Guitars.model.Guitar;
import cn.Guitars.model.GuitarSpec;
import cn.Guitars.service.GuitarService;
@Transactional
@Lazy(true)
@Service("guitarService")
public class GuitarServiceImpl implements GuitarService{
	@Resource(name="mysqlDao")
	protected GuitarDao mysqlDao;
	@Resource(name="sqliteDao")
	protected GuitarDao sqliteDao;
	@Autowired
	protected Inventory inventory;
	
	
	@Override
	public List<Guitar> queryAll() {
		// TODO Auto-generated method stub
		return mysqlDao.queryAll();
//		return sqliteDao.queryAll();
	}


	@Override
	public void addGuitar(Guitar model) {
		// TODO Auto-generated method stub
		sqliteDao.addGuitar(model);
		mysqlDao.addGuitar(model);
	}


	@Override
	public void deleteGuitar(int id) {
		// TODO Auto-generated method stub
		sqliteDao.deleteGuitar(id);
		mysqlDao.deleteGuitar(id);
	}


	@Override
	public List<Guitar> search(GuitarSpec guitarSpec) {
		// TODO Auto-generated method stub
		List<Guitar> guitars=mysqlDao.queryAll();
		inventory.search(guitarSpec, guitars);
		return null;
	}
	
	

}
