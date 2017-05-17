package cn.Guitar.Service;
import java.util.List;

import cn.Guitar.Dao.*;
import cn.Guitar.Entity.Guitar;
import cn.Guitar.Entity.GuitarSpec;
public class GuitarService {

	private GuitarDaoImpl guitarDao=new GuitarDaoImpl();
	public void setGuitarDao(GuitarDaoImpl guitarDao) {
		this.guitarDao = guitarDao;
	}
	public List<Guitar> Search(GuitarSpec spec){
		return guitarDao.Search(spec);
	}
}
