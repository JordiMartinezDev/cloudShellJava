package inheritancePackage;
public abstract class Human {

	String name;
	int age;
	
	// Constructor
	public Human(int age, String name) { 
		this.age = age;
		this.name = name;
	}
	public void speak() {
		System.out.println("Hello, my name is : "+ name);
		System.out.println("I am "+ age + " years old");
	}
	
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking...");
	}
	public void work() {
		System.out.println("working..");
	}

	public static void staticMethod(){
		System.out.println("Static method called: ");
	}

	public abstract void fuck();
}
