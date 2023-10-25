package basics;

import encapuslation.EncapulationIntro;

public class MainClass {
	
	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.age = 24;
//		p1.name = "Mohit";
//		
//		Person p2 = new Person();
//		p2.age = 70;
//		p2.name = "Rohan";
//		
//		Person p3 = new Person(21, "Karan Singh");
		
//		System.out.println(p1.age+" "+p1.name);
//		System.out.println(p2.age+" "+p2.name);
//		
//		p1.eat();
//		p2.walk();  
//		p2.walk(89);
//		System.out.println(p3.name);
//		System.out.println(Person.count);
		
//		Developer d1 = new Developer(12, "xaca");
//		d1.walk();
		
//		EncapulationIntro obj = new EncapulationIntro();
//		obj.doWork();
	}
 
}

class Person {
	String name;
	int age;
	
	static int count;
	
	public Person() {
		count++;
		System.out.println("creating an object");
	}
	
	public Person(int age, String name) {
		this();
		this.name = name;
		this.age = age;
	}
	void walk() {
		System.out.println(name+" is walking.");
	}
	void eat() {
		System.out.println(name+" is eating.");
	}
	void walk(int steps) {
		System.out.println(name+" walked "+steps+" steps");
	}
}

class Developer extends Person {
	public Developer(int age, String name) {
		super(age, name);
	}
	void walk() {
		System.out.println("Developer "+name+" is walking.");
	}
}
