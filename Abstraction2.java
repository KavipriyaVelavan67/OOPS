interface Vehicleinterface{
	
	int wheel = 4;
	static String colour="red";
	static final String name="Maruthi";
	
	void run();
}

interface Factory extends Vehicleinterface{
	
	 void run1();	
}

abstract class Carabstract{
	
	abstract void run2();
	
	public void print(){
		
		System.out.println("print");
	}
}
class Vehicle extends Carabstract implements Factory{
	
	public void run(){
		System.out.println("from Vehicleinterface");
	}
	public void run1(){
		System.out.println("from factory Interface");
	}
	public void run2(){
		System.out.println("from car abstract class");
	}
	public void run3(){
		System.out.println("Vehicle class");
	}
	
}

public class Abstraction2{
     public static void main(String[]args){
	    
		
		Vehicle v = new Vehicle();
		v.run();
		v.run3();
		
		//v.wheel=5;
		//System.out.print(v.wheel);
		
		Factory c=new Vehicle();
		c.run1();
		
		Carabstract f=new Vehicle();
		f.run2();
		
		Vehicleinterface k = new Auto();
        k.run();
		
		RepairShopIntf.repair(v);
	 }
}

class Auto implements Vehicleinterface{
	
	public void run(){
		System.out.println("Auto running from auto class");
	}
}
class RepairShopIntf {
	    
		public static void repair(Vehicleinterface p){
		p.run();
		
	   }
}