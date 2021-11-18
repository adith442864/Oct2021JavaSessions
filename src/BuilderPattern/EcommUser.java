package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {
		
		
		EcommApp shop = new EcommApp();
		
		shop.login()
		    .login("admin", "admin123")
			.doSearch("macbook", 1000)
			.addToCart("macbook")
			.doPayment("icicibank", "test123")
			.getEmail()
			.logout()
			
			.login()
			.doSearch("Nike shoes")
			.addToCart("Nike Shoes")
			.doPayment("Google Pay", "test123")
			.logout();
		
		int orderId = shop.generateOrderId();
		System.out.println(orderId);
		
		shop.login().doPayment("HDFC", "2334343").logout();
		
		shop.login().addToCart("imac").doPayment("bank", "test123").logout();
		
		
			
	}

}
