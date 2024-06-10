interface Bird{
	
	public void fly();
	public void eat();
	
}
class Kiwi implements Bird{
	
	public void fly(){
		
		System.out.println(" Kiwi is Flying");
	}
	public void eat(){
		
		System.out.println("kiwi is Eating");
	}
}
class Parrot implements Bird{
	
	public void fly(){
		
		System.out.println(" parrot is Flying");
	}
	 
	public void eat(){
		
		System.out.println("Paarot is Eating");
	}
}
public class Interfacetest{
     
	 public static void main(String[]args){
	      
		  
		  Bird b = new Kiwi();
		  b.fly();
		  b.eat();
	 }
}