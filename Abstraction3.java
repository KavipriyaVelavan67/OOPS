interface display{
	
	void display();
}
interface Touchscreen{
	
	void Touch();
}
interface Camera{
	
	void shoot();
}
class Nokia implements display{
	
	public void display(){
		
		System.out.println("Nokia display");
	}
}
class Vivo implements display,Touchscreen,Camera{
	
	public void display(){
		
		System.out.println("Vivo display");
	}
	public void Touch(){
		
		System.out.println("Vivo Touchscreen");
	}
	public void shoot(){
		
		System.out.println("Vivo camera");
	}
	
}
public class Abstraction3{
         public static void main(String[]args){
	    
           display d = new Nokia();
		   d.display();
		   
		   Vivo v = new Vivo();
		   v.display();
		   v.Touch();
		   v.shoot();
		   
		   Mobile.Mobile(d);
	 }

}
class Mobile{
	
	public static void Mobile(display p){
		System.out.println("mobile phone");
		p.display();
	}
}