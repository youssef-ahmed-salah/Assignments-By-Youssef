
public class BookProduct extends product {
	 public String author;
	 public String publisher;
	 public BookProduct(String name,int productID,  float price,String author,String publisher) {
			super(productID, name, price);
		    this.author=author;
		    this.publisher=publisher;
			}
	 public String getauthor() {
			return author;
		}
		public String getpublisher() {
			return publisher;
		}
		public void setauthor(String author) {
			this.author= author;
		}
		public void setpublisher(String publisher) {
		    this.publisher=publisher;	
		}

}
