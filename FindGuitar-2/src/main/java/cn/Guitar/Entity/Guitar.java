package cn.Guitar.Entity;

public class Guitar {
	private String serialNumber;
	private double price;
	private GuitarSpec spec;
	public Guitar(String serialNumber,double price,GuitarSpec spec){
		super();
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setSpec(GuitarSpec spec) {
		this.spec = spec;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	
}
