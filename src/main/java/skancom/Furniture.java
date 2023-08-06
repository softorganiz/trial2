package skancom;

public class Furniture {
	private String description;
	private String price;
	private String tenant;
	
	public Furniture(String desc,String price,String tenant){
		this.setDescription(desc);
		this.setPrice(price);
		this.setTenant(tenant);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String  price) {
		this.price = price;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}
	

}