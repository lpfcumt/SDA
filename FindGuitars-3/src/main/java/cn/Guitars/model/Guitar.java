package cn.Guitars.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="guitar1")
public class Guitar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private Double price;
	@Column
	private Builder builder;
	@Column
	private String model;
	@Column
	private Type type;
	@Column
	private Wood backWood;
	@Column
	private Wood topWood;
	@Column
	private int numStrings;
	@Transient
	private GuitarSpec spec;
	
	public Guitar(){
		
	}
	public Guitar(int id, Double price, Builder builder, String model, Type type, Wood backWood, 
			Wood topWood,int numStrings) {
		super();
		this.id=id;
		this.price=price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.numStrings = numStrings;
		this.spec=new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
	}

	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	public void setNumStrings(int numStrings) {
		this.numStrings = numStrings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public GuitarSpec getSpec() {
		return new GuitarSpec(builder,model,type,backWood,topWood,numStrings);
//		return spec;
	}
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
}
