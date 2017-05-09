package cn.Guitars.dao;

import java.util.List;

import cn.Guitars.model.Admins;



public interface AdminsDao extends BaseDao<Admins>{

	List<Admins> findById_Password(int admins_id, String admins_password);

}
