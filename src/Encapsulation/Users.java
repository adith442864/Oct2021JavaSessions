package Encapsulation;

public class Users {
	
	public String name;
	public int age;
	public int id;
	
	
	public Users() {
		System.out.println("Default constructor");
	}


	public Users(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}












	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
