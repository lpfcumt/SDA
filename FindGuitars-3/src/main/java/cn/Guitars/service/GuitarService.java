package cn.Guitars.service;

import java.util.List;

import cn.Guitars.model.Guitar;
import cn.Guitars.model.GuitarSpec;

public interface GuitarService{

	List<Guitar> queryAll();

	void addGuitar(Guitar model);

	void deleteGuitar(int id);

	List<Guitar> search(GuitarSpec guitarSpec);
}
