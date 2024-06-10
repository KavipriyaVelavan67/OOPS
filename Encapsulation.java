class Person{
      
	  private int age;
	  private String name;
	  
	  public  String getName(){
		  
		  return name;
	  }
	  
	  public void setName(String name){
		  
		  this.name=name;
	  }
	  
	  public  int getage(){
		  
		  return age;
	  }
	  
	  public void setage(int age){
		  
		  this.age=age;
	  }
	  
	   @Override
    public String toString() {
        return "Person{" +
                "name=" + this.name +
                ", age='" + this.age + '\'' +
                '}';
	}
}


public class Encapsulation{
        
		public static void main(String[]args){
		  
		Person p=new Person();
		 
		 p.setName("Kavya");
		 p.setage(21);
		 System.out.println(p.getName());
		 System.out.println(p);
		 
		 p.setName("Heera");
		 p.setage(18);
		 
		 System.out.println(p.getName());
		 System.out.println(p);
		  
		
		}
}