class Shop{
          
        int count;
        String customer;
        String products;

    Shop(){
          
          System.out.println("Happing shopping");

      }
    Shop(int count,String customer,String products){
               
                 this.customer =customer;
                 this.count= count;
                 this.products=products;

        }
}

public class Classvariables{
    public static void main(String[]args){
	  
        Shop s = new Shop(3,"retail","Dress");
        System.out.println(s.products);
        System.out.println(s.customer);
        System.out.println(s.count);


      }
   }