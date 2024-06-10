/*Write a Java program to create an interface Shape with the getArea() method.
Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
Implement the getArea() method for each of the three classes.*/

public class Shapesinterface{
	public static void main(String[]args){
		
		Shape t = new Triangle(3,3,4);
		Shape c = new Circle(3,3.14);
		Shape r = new Rectangle(4,6);
		
		System.out.println(t.getArea());
		System.out.println(c.getArea());
		System.out.println(r.getArea());
		
	}
	
}
interface Shape{

	double getArea();
}
class Circle implements Shape{
	
	double r;
	double pi;
	
	Circle(double r,double pi){
		
		this.pi=pi;
		this.r=r;
	}
	
	public double getArea(){
		
		return pi*r*r;
	}
}
class Rectangle implements Shape{
	
	int l;
	int b;
	
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	
	public double getArea(){
		return l*b;
	}
}
class Triangle implements Shape{
	
	int a;
	int b;
	int c;
	
	Triangle(int a,int b,int c){
		
		this.a=a;
		this.b=b;
	    this.c=c;
		
	}
	public double getArea(){
		
		return a*b*c;
	}
}