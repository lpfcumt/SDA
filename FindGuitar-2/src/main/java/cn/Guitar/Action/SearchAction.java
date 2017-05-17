package cn.Guitar.Action;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.Guitar.Entity.Guitar;
import cn.Guitar.Entity.GuitarSpec;
import cn.Guitar.Service.GuitarService;

public class SearchAction extends ActionSupport{
	private String builder;
	private String model;
	private String type;
	private String backWood;
	private String topWood;
	public String getBuilder() {
		return builder;
	}

	public void setBuilder(String builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBackWood() {
		return backWood;
	}

	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}

	public String getTopWood() {
		return topWood;
	}

	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}


	
	public String execute() throws Exception{
		List<Guitar> list=new LinkedList();
		GuitarService guitarService=new GuitarService();
		GuitarSpec spec=new GuitarSpec();
		spec.setBuilder(builder);
	    spec.setTopWood(topWood);
	    spec.setBackWood(backWood);
	    spec.setModel(model);
	    spec.setType(type);
	    list=guitarService.Search(spec);
	    System.out.println(type);
	    ActionContext.getContext().getSession().put("searchlist", list);
	    return SUCCESS;
	}
}
