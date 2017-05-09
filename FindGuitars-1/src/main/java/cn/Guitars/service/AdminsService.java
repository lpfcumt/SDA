package cn.Guitars.service;

import cn.Guitars.model.Admins;

public interface AdminsService extends BaseService<Admins> {

		Admins findById_Password(int admins_id, String admins_password);

	}