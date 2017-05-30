package cn.Guitars.action;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;

import cn.Guitars.model.Guitar;
import cn.Guitars.model.GuitarSpec;

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
		guitarService.addGuitar(model);
		return SUCCESS;
	}
	
	//É¾³ý¼ªËû
	public String deleteGuitar() throws Exception{
		guitarService.deleteGuitar(model.getId());
		return "deleteGuitar";
	}
	
	//ËÑË÷¼ªËû
	public String  search() throws Exception{
		GuitarSpec guitarSpec=new GuitarSpec();
		guitarSpec.setBackWood(model.getBackWood());
		guitarSpec.setBuilder(model.getBuilder());
		guitarSpec.setModel(model.getModel());
		guitarSpec.setNumStrings(model.getNumStrings());
		guitarSpec.setTopWood(model.getTopWood());
		guitarSpec.setType(model.getType());
		List<Guitar> list =guitarService.queryAll();
		session.put("list", list);
		return "search";
	}
	

	
	

}
