final class Finalclass{
	
	int a = 10;
	final int c = 20;
	static final int b = 23; 
	
	final void Print(){
		System.out.println("final method of final class");
	}
	public void Paste(){
		
		System.out.println("Normal method of final class");
	}
}
class Normal{
	
	String s = "Happy Weekend";
	final String k = "Weekdays";
	
	final void display(){
		
		System.out.println("final method of Normal class");
	}
	public void show(){
		
		System.out.println("Normal method of Normal class");
	}
	
}
final class Mixed extends Normal{
	
	public void Paste(){
		
		System.out.println("Normal method of final class");
	}
	 final void Print(String s){
		
		System.out.println("final method of final class "+s);
	}
}

public class Final{
     public static void main(String[]args){
	 
	 Finalclass f = new Finalclass();
	 f.Print();
	 
	 Mixed m = new Mixed();
	 m.Print("Hi");
	 
	 f.a++;
	 System.out.println(f.a);
	 
	 }
}