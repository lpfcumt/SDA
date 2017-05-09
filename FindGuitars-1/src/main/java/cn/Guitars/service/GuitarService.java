package cn.Guitars.service;

import java.util.List;

import cn.Guitars.model.Guitar;

public interface GuitarService extends BaseService<Guitar>{

	List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type);

}
