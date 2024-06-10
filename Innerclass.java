public class Innerclass{
     public static void main(String[]args){
	 
	       Outer.Calculator o = new Outer().new Calculator();
		   
           System.out.println(o.add(2,3));		
           System.out.println(o.multiply(2,3));		   
           System.out.println(o.sub(2,3));		   
           System.out.println(o.division(6,2));		   
	   
	 }
}
class Outer{
	
	class Calculator{
		
		    Calculator(){
				
				System.out.println("Calculator");
			}
		
		  public int add(int a,int b){
			   return a+b;
		  } 
		  public int sub(int a,int b){
			   return b-a;
		  }  
          public int multiply(int a,int b){
			   return a*b;
		  }  
          public int division(int a,int b){
			   return a/b;
		  }  		  
	}
}