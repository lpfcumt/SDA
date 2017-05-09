package cn.Guitars.service.impl;

import org.springframework.stereotype.Service;

import cn.Guitars.model.Admins;
import cn.Guitars.service.AdminsService;

@Service("adminsService")
public class AdminsServiceImpl extends BaseServiceImpl<Admins> implements AdminsService {

	@Override
	public Admins findById_Password(int admins_id, String admins_password) {
		// TODO Auto-generated method stub
		if (!adminsDao.findById_Password(admins_id,admins_password).isEmpty()) {
			return adminsDao.findById_Password(admins_id,admins_password).get(0);
			
		}
		else {
			return null;
		}
	}

}
