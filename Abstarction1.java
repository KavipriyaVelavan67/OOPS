abstract class Mobilephone{
	
	abstract void display();
}

class Xiomi extends Mobilephone{
	
	public void display(){
		 
		 System.out.println("Xiomi display");
	}
	   
}
class Redmi extends Mobilephone{
	
	public void display(){
		 
		 System.out.println("Redmi display");
	}
	   
}
class Vivo extends Mobilephone{
	
	public void display(){
		 
		 System.out.println("Vivo display");
	}
	   
}

public class Abstraction1{
       public static void main(String[]args){
		  
		  Xiomi x = new Xiomi();
		  Redmi r = new Redmi();
		  Mobilephone m = new Vivo();
		   
		  x.display();
		  r.display();
		  m.display();
		  
	   }
}