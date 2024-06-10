public class Classandobject2{
	
	public static void main(String[]args){
		
		Person p1 = new Person();
		Person p2 = new Person("Kavya",21);
		
		p2.Print();
	}
}

class Person{
	
	String name;
	int age;
	
	Person(String a, int b){
		
		this.name=a;
		this.age=b;
	}
	
	Person(){
	
		System.out.println("Non parameterized Constructor");
	}
	
	public void Print(){
		
		System.out.println("Name of the Person is "+this.name+" "+"and age of the person is "+this.age);
		
	}
}