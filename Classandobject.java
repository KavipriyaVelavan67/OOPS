public class Classandobject
{
	public static void main(String[]args)
	{
	    Vehicle v2=new Vehicle(4,"Black");
	    Vehicle v3=new Vehicle(4,"Black");
		
		v2.Print();
		v3.Print();
		
		//Vehicle.name = "Mahindra";
		//Vehicle.model = "1980";
		//Vehicle.display();	
		
		System.out.println(v2);
		System.out.println(v3);
		
		System.out.println("v2 == v3: "+(v2 == v3));
		System.out.println("v2.equals(v3): "+(v2.equals(v3)));
		
		
	}
}

class Vehicle{
	
	int wheels;
	String colour;
	
    static String name;
	static String model;
	
	public Vehicle(){
		
		//System.out.println("No argument constructor");
	}
	
	public Vehicle(int wheels,String colour){
		
		//System.out.println(" Parameterized constructor");
		
		this.wheels = wheels;
		this.colour = colour;
	}
	
	public void Print(){
		
		System.out.println("Wheel is "+this.wheels+" "+"colour is "+this.colour);
	}
	
	public static void display(){
		
		System.out.println("The vehicle name is "+name);
	}
	public static void Type(){
		
		System.out.println("The vehicle name is "+model);
	}	
	
	@Override
     public String toString() {
         return "Vehicle values are " +
                 "wheels=" + wheels +
                 ", colour='" + colour;
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (!(o instanceof Vehicle)) return false;
         Vehicle vehicle = (Vehicle) o;
         return wheels == vehicle.wheels && Objects.equals(colour, vehicle.colour);
     }

     @Override
     public int hashCode() {
         return Objects.hash(wheels,colour);
     }
 }
