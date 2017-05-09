package cn.Guitars.action;

import java.util.HashMap;
import java.util.Map;
import cn.Guitars.model.Admins;



public class AdminsAction extends BaseAction<Admins>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, Object> jsonMap=new HashMap<String, Object>();
	private int id;
	private String students_password;
	
	
	public String getStudents_password() {
		return students_password;
	}

	public void setStudents_password(String students_password) {
		this.students_password = students_password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	
	/*ºÏ≤È’À∫≈√‹¬Î*/
	/*public String Check_AdminsLogin() throws Exception{
		
		Admins admins=adminsService.findById_Password(model.getId(),model.getPassword());
		if (admins==null) {
			 jsonMap.put("flag", false);
		}
		else {
			jsonMap.put("flag", true);
		}
		;
		
		return "Check_AdminsLogin";
	}
	
	π‹¿Ì‘±µ«¬º
	public String AdminsLogin() throws Exception{

		Admins admins=adminsService.findById_Password(model.getId(),model.getPassword());
		session.put("admins_idcs", admins.getId());
		session.put("admins_id", admins.getId());
		session.put("admins_name", admins.getName());
		session.put("admins_email", admins.getEmail());
		session.put("admins_tel", admins.getTel());
		return SUCCESS;
	}*/
	public String Add() throws Exception{
		model.setName("123456");
		model.setPassword("123456");
		model.setEmail("1");
		model.setId(123456);
		model.setTel("1236");
		adminsService.save(model);
		Admins admins= adminsService.query().get(2);
		System.out.println(admins.getId());
		return SUCCESS;
		
	}
}
