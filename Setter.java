public class Setter{
  public static void main(String[]args){
  
      Dog d1 = new Dog("Browny","Golden Retriever");
	  Dog d2 = new Dog("Bogu","vodaphone");
	  
	  d1.setName("Cyrus");
	  d1.setBreed("Labarador");
	  
	  d2.setName("Monu");
	  d2.setBreed("Labarador");
  }
}

class Dog{
	
     String name;
	 String breed;
     
	 Dog(String n,String k){
	   
   	    this.name  = n;
		this.breed = k;
		
		System.out.println("Name of the Dog is "+this.name);
		System.out.println("Breed type of dog "+this.breed);
		System.out.println();
	 }
	 
	 public void setName(String name){
	    System.out.println(" Changed name of the Dog is "+name);
	 }
	 
	 public void setBreed(String breed){
	    System.out.println("Changed breed type of dog "+breed);
	 }
	 
}