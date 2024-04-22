
public class product {
	public int productID;
	public String name;
	public float price;
	public product (int productID,String name,float price) {
		//else take absolute fro product 3shan positive integer bs 
		this.productID=Math.abs(productID);
		this.name=name;
		this.price=(float) Math.abs(price);
	}
	public int  getproductID() {
		return productID;
	}
	public String  getname() {
		return name;
	}
	public float  getprice() {
		return price;
	}
	public void setproductID(int productID) {
		this.productID=Math.abs(productID);
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setprice(float price) {
		this.price=Math.abs(price);
	}
	


}
