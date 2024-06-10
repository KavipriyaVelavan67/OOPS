abstract class Animal{
	String name;
	

	public Animal(String name){
		
		this.name=name;
		
		System.out.println("Animal constructor"+name);
	}
	
	abstract void makesound();
	
	public void habit(){
		
		System.out.println("Eating");
		
	}
	
	public void name(String str){
		
		System.out.println(str);
		
	}
} 
class Dog extends Animal{
	
	public Dog(String name){
		
        super(name); 
        System.out.println("Dog constructor called");
	}
	public void makesound(){
		
		System.out.println("Bow bow");
	}
}	
/*class Cat extends Animal{
	
	public void makesound(){
		
		System.out.println("Meow Meow");
	}
}*/	

public class Abstracttest{
     public static void main(String[]args){
	    
		Animal d = new Dog("lion");
		
		d.makesound();
		d.makesound();
		d.habit();
		d.name("goat");
	 }
}