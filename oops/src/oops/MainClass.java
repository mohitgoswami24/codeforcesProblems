package oops;

public class MainClass {
    public static void main(String [] args) {
    	Person p1 = new Person();
    	p1.age = 23;
    	p1.name = "Mike";
    	p1.walk();
    	p1.walk(29);
    }
}
class Person{
	int age;
	String name;
	
	void walk() {
		System.out.println(name + " is Walking.");
	}
	
	void walk(int steps) {
		System.out.println(name+" walked "+steps+" steps.");
	}
}
