package cn.Guitars.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mysql.fabric.xmlrpc.base.Value;

import cn.Guitars.model.Guitar;

public class GuitarAction extends BaseAction<Guitar>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> jsonMap=new HashMap<String,Object>();

	public Map<String, Object> getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map<String, Object> jsonMap) {
		this.jsonMap = jsonMap;
	}
	
	//Ìí¼Ó¼ªËû
	public String addGuitar() throws Exception{
		
		guitarService.save(model);
		
		return SUCCESS;
		
	}
	
	//ËÑË÷¼ªËû
	public String searchGuitar() throws Exception{
		List<Guitar> searchlist=guitarService.searchGuitar(model.getBackwood(),model.getBuilder(),model.getModel(),model.getNumstrings(),model.getTopwood(),model.getType());
		session.put("searchlist", searchlist);
		return SUCCESS;		
	}

}
