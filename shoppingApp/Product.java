package shoppingApp;

public class Product {
	
	int productId;
	String productName;
	int price;
	
	Product(int productId,String productName,int price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	void addToCart(Product p) {
		
		System.err.println("CART ITEMS");
		System.out.println();
		if(p instanceof Mobile) {	
			System.out.println("Product Id : " + p.productId);
			System.out.println("Model      : " + p.productName);
			System.out.println("Price      : " + p.price);
			Mobile m = (Mobile) p;
			System.out.println("IEMI No    : " + m.iemino);
			System.out.println();
		}
		else if(p instanceof Tv){
			System.out.println("Product Id : " + p.productId);
			System.out.println("Model      : " + p.productName);
			System.out.println("Price      : " + p.price);
			Tv t = (Tv)p;
			System.out.println("Model No   : " + t.modelNo);
			System.out.println();
		}
		else if(p instanceof Laptop) {
			System.out.println("Product Id : " + p.productId);
			System.out.println("Model      : " + p.productName);
			System.out.println("Price      : " + p.price);
			Laptop l = (Laptop)p;
			System.out.println("Serieal No : " + l.seriealNo);	
		}
	}	
	public static void main(String[] args) {
		
		Product vivo = (Product)new Mobile();
		vivo.addToCart(vivo);
		
		Product sony =(Product) new Tv();
		sony.addToCart(sony);
		
		Product hp =(Product) new Laptop();
		hp.addToCart(hp);
	}	
}
