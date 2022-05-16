
//Course Name: CMSC203
//Project Number: 6
//Name: Daniel Fesenko
//Program: Eclipse

public class Customer {
	private String name;
	private int age;
	
	public Customer(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public Customer(Customer c2) {
		name = c2.getName();
		age = c2.getAge();
	}
	
	public String toString() {
		return("Customer Name: " + name + " Customer Age: " + age);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) { 
		this.age = age;
	}
}
