class Vehicle{
	
	int wheels=10;
	String colour="Black";
	
	public Vehicle(){
		
		System.out.println("No Parameterized Constructor");
	}
	
	public Vehicle (int wh,String r){
		this.wheels = wheels;
		this.colour = colour;
		
		System.out.println("Parent parameter Constructor ");
	}
	
	  public void displayVehicle() {
        
		System.out.println("parent "+this.wheels + " "+this.colour );
    }
	public String toString() {
        return "Vehicle{" +
                ", wheels=" + wheels +
                ", colour='" + colour + '\'' +
                '}';
    }

}
class Car extends Vehicle{
	
	String name = "Maruthi";
	
	public Car(){
		
		System.out.println("Child constructor");
	}
	
	public Car(int w,String s,String n){
		
		super(w,s);
		
		//this.wheels=wheels;
		//this.colour=colour;
		
		this.name=name;
		
		System.out.println("Child Param Constructor " + this.name);
	}
	
	public void display() {
        System.out.println("child ");
    }

    public void displayCar() {
        System.out.println("child car");
    }

	public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", colour='" + colour + '\'' +
                '}';
    }

}
class Auto extends Vehicle{
	
	String type;
	
	public Auto(){
        
		System.out.println("Auto Constructor");
    }
	
	public Auto(int wheels,String colour,String type){
		
		this.wheels=wheels;
		this.colour=colour;
		this.type=type;
       
          System.out.println("Auto param Constructor");
		  
	}
	public static void printAuto(){
        System.out.println("print auto");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "type='" + type + '\'' +
                ", wheels=" + wheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}

public class Inheritancetest{
    public static void main(String[]args){
	   
	  Vehicle v = new Vehicle();
	  Car c = new Car(4,"Bolero","White");
	  Auto a = new Auto(3,"Rapido","share");
	  
	  c.displayVehicle(); 
	  c.display();
	  c.displayCar();
	  
	  a.printAuto();
	  
	  c.colour="blue";
	  System.out.println(c);
	  
	  a.colour="pink";
	  System.out.println(a);
	  
	  System.out.println(v);
	  
	  
	   
	}

}