package cn.Guitars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="guitar")
@Table(name="guitar")
public class Guitar {
	private int rowid;
	private String builder;
	private String model;
	private String type;
	private int numstrings;
	private String backwood;
	private String topwood;
	private int price;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getRowid() {
		return rowid;
	}
	public void setRowid(int rowid) {
		this.rowid = rowid;
	}
	@Column
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	@Column
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Column
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column
	public int getNumstrings() {
		return numstrings;
	}
	public void setNumstrings(int numstrings) {
		this.numstrings = numstrings;
	}
	@Column
	public String getBackwood() {
		return backwood;
	}
	public void setBackwood(String backwood) {
		this.backwood = backwood;
	}
	@Column
	public String getTopwood() {
		return topwood;
	}
	public void setTopwood(String topwood) {
		this.topwood = topwood;
	}
	@Column
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
