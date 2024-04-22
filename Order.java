
public class Order {
	public int customerID;
	public int orderID;
	private product []products2;
	public float totalprice;
	
	public Order(int customerID,int orderID,product []products2,float totalprice) {
		this.customerID=Math.abs(customerID);
		this.orderID=Math.abs(orderID);
		this.products2=products2;
		this.totalprice=Math.abs(totalprice);
	}
	public void printOrderInfo() {
		System.out.println("Customer ID: " + customerID);
		System.out.println("Order ID: " + orderID);
        System.out.println("Products:");
        for(int i =0; i< products2.length;i++) {
        	if (products2[i]!=null) {
        		System.out.println(" "+ products2[i].getname()+ "$"+products2[i].getprice());
        	}
        }
        System.out.println("Total price : "+(float)totalprice+"$");
	}

}
