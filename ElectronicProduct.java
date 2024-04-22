
public class ElectronicProduct extends product {
    public String brand;
    public int warrantyPeriod;
	public ElectronicProduct(String name,int productID,  float price, String brand,int warrantyPeriod) {
		super(productID, name,price);
	    this.brand=brand;
	    this.warrantyPeriod=warrantyPeriod;
		}
	public String getbrand() {
		return brand;
	}
	public int getwarrantyPeriod() {
		return warrantyPeriod;
	}
	public void setbrand(String brand) {
		this.brand= brand;
	}
	public void setwarrantyPeriod(int warrantyPeriod) {
	    this.warrantyPeriod=warrantyPeriod;	
	}

}
