package Encapsulation;

public class UserTest {

	public static void main(String[] args) {
		
		Users user = new Users();
		
		//1st : Directly accessing them:
		user.name="Tom";
		System.out.println(user.name);
		
		//2. using constructor:
		Users user1 = new Users("Liza", 25, 101);
		System.out.println(user1.name +" "+user1.age+" "+user1.id);
		
		//3. using getter and setter:
		Users u2 = new Users();
		u2.setName("Steve");
		u2.setAge(30);
		u2.setId(102);
		
		System.out.println(u2.getName() +" "+u2.getAge()+" "+u2.getId());
		System.out.println(u2.name+" "+u2.age+" "+u2.id);
		
		

	}

}
