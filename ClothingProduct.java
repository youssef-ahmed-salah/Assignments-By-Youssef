
public class ClothingProduct extends product {
	 public String size;
	 public String fabric;
	 public ClothingProduct( String name, int productID,float price,String size,String fabric) {
			super(productID, name, price);
		    this.size=size;
		    this.fabric=fabric;
			}
	 public String getsize() {
			return size;
		}
		public String getfabric() {
			return fabric;
		}
		public void setsize(String size) {
			this.size= size;
		}
		public void setfabric(String fabric) {
		    this.fabric=fabric;	
		}

}
