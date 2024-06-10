class Bankaccount{
	
	private int accountNumber;
	private int balance;
	
   public void setaccountNumber(int accountNumber){
	   
	   this.accountNumber=accountNumber;
   }	
   public int getaccountNumber(){
	   return accountNumber;
   }
   public void setbalance(int balance){
	   
	   this.balance=balance;
   }	
   public int getbalance(){
	   return balance;
   }
}

public class Bankencapsulation{
       public static void main(String[]args){
		   
		   Bankaccount ba = new Bankaccount();
		   ba.setaccountNumber(15671890);
		   ba.setbalance(3000);
		   
		   System.out.println(ba.getaccountNumber());
		   System.out.println(ba.getbalance());
	   }

}