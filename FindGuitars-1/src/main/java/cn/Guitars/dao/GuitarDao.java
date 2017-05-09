package cn.Guitars.dao;

import java.util.List;

import cn.Guitars.model.Guitar;

public interface GuitarDao extends BaseDao<Guitar>{

	List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type);

}
