import java.util.Scanner;
public class EcommerceSystem {
public static void main(String[] args) {
		ElectronicProduct electronic= new ElectronicProduct("Smartphone",1,(float) 599.99,"Samsung",1);
		ClothingProduct clothing= new ClothingProduct("tshirt",2,(float) 19.99,"medium","Cotton");
	    BookProduct book= new BookProduct("Object oriented programming",3,(float) 39.99,"O'reilly","X publicatoions");
 System.out.println("Welcome to the E-Commerce System!");
 Scanner input= new Scanner(System.in);
 System.out.println("Enter your name:");
 String custname=input.next();
 System.out.println("Good morning "+ custname+" !"+"  ,Please Enter your ID:");
 int customerID = input.nextInt();
 System.out.println("Enter your address:");
 String address=input.next();
 Customer cust1 = new Customer(customerID,custname,address);
 System.out.println("Are you willing to place order, if so how many products?");
 int nproducts=input.nextInt();
 Cart cart1= new Cart(cust1.getcustomerID(),nproducts);
 for ( int i = 0 ; i<nproducts ;i++) {
	 System.out.println("Which product would you like to add? 1- Smartphone 2- T-shirt 3-Book");
     int choice = input.nextInt();
     switch (choice) {
     case 1:
    	 Cart.addproduct(new ElectronicProduct("Smartphone",1,(float) 599.9,"Samsung",1),i);
         break; 
     case 2:
    	 Cart.addproduct( new ClothingProduct("tshirt",2,(float)19.99,"medium","Cotton"),i);
    	 break;
     case 3:
    	 Cart.addproduct(new BookProduct("Object oriented programming",3,(float)39.99,"O'reilly","X publicatoions"),i);
         break;    
     default :
    	 System.out.println("invalid input, please choose 1 or 2 or 3 ");
     }
     
 }
 float totalprice = Cart.calcprice();
 System.out.println("Your total is "+(float)totalprice+"$." );
 System.out.println("Would you like to place order ? 1- Yes, 2-No");
 int choicetoplace=input.nextInt();
 if (choicetoplace ==1) {
	 Order order1 = new Order (cust1.getcustomerID(),1,cart1.getproducts(),totalprice);
	 System.out.println("Here is your order's summary:");
	 order1.printOrderInfo();
 }else {
	 System.out.println("order not placed");
 }}}
