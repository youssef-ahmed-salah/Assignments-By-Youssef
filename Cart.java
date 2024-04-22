public class Cart {
public int customerID;
public static int nproducts;
private static product []products;
public Cart(int customerID, int nproducts) {
    this.customerID = Math.abs(customerID); 
    this.nproducts = Math.abs(nproducts); 
    this.products = new product[nproducts]; 
}
public int getcustomerID() {
	return customerID;}
public int getnproducts() {
	return  nproducts;}
public product[] getproducts() {
	return  products;}
public void setcustomerID(int customerID) {
    this.customerID= Math.abs(customerID);}
public void setnproducts(int nproducts) {
    this.nproducts = Math.abs(nproducts);
    products = new product[nproducts];}
public static void addproduct(product product11, int index) {
	if (index >= 0 && index < nproducts) {
		products[index]=product11;
	}else {
		System.out.println("you cant add product here");
	} }
public void removeproduct(int index) {
	if ( index >= 0 && index<nproducts) {
		products[index]=null;
	}else {
		System.out.println("there is no product to remove. ");
	}
}
public static float calcprice() {
	float totalprice = 0;
	for(int i=0;i < nproducts;i++) {
		if(products[i]!=null) {
			totalprice+=products[i].getprice();
		}
	}
	return totalprice;	
}
public void placeorder() {
	System.out.println("your order is placed, and being shipped already!");
	}}

