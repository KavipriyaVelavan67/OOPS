public class Accessmodifier{
	public static void main(String[]args){
		
		Normal n = new Normal();
		n.statement();
		
		
		
	}

}
protected class protect{
	
	protected int a=10;
	static int b = 0;
	
	protected void statement(){
		System.out.println("protected");
	}
	
}
class Normal extends protect {
	
	protected void statement(){
		System.out.println("Normal");
	}
	
}