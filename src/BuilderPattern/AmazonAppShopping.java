package BuilderPattern;

public class AmazonAppShopping {

	public static void main(String[] args) {
		
		AmazonApp shop = new AmazonApp();
		
		shop.login(9999, 1234)
			.search("Apple Macbook")
			.addToCart("Apple Macbook")
			.payment("1234")
			.logout();
		
		System.out.println("-------------");
		
		shop.login("admin@gmail.com", "admin123")
			.addToCart("Apple Macbook")
			.payment("123454")
			.logout();
			
		System.out.println("--------------------");
		shop.login("admin", "admin1213")
			.logout();

	}

}
