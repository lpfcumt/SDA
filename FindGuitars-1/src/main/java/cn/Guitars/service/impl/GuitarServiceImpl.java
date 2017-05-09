package cn.Guitars.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.Guitars.model.Guitar;
import cn.Guitars.service.GuitarService;
@Service("guitarService")
public class GuitarServiceImpl extends BaseServiceImpl<Guitar> implements GuitarService{

	@Override
	public List<Guitar> searchGuitar(String backwood, String builder, String model, int numstrings, String topwood,
			String type) {
		// TODO Auto-generated method stub
		return guitarDao.searchGuitar(backwood, builder, model, numstrings, topwood, type);
	}

}
