public class Static{
   public static void main(String[]args){
   
         int a = 11;
		 Numbers n = new Numbers(13);
		 
		 a++;
		 System.out.println(a);
		 
		 n.a++;
		 System.out.println(n.a);
   
   }
}

class Numbers{
	
	 int a=12;
	 
	 Numbers(int a){
		 
		 this.a=a;
		 System.out.println(a);
	 }
	 
	 
	// n.a++;
	 //System.out.println(n.a);
}