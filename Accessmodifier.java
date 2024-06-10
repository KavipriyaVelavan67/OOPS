public class Accessmodifier{
	public static void main(String[]args){
		
		Normal n = new Normal();
		protect m = new protect();
		n.statement();
		m.statement();
        
		protect.b++;
		m.a++;
		System.out.println(protect.b+m.a);
	}

}
class protect{
	
	protected int a=10;
	static int b = 0;
	
	protected void statement(){
		System.out.println("protected");
	}
	
}
class Normal extends protect {
	
	protected void statement()
	{
		System.out.println("Normal");
	}
	
}