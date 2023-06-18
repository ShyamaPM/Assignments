package interface_sample;

public class NormalClass implements InterfaceClass2 {
	
	public void div() 
	{
		int d = a/b;
		System.out.println("Division: "+d);
	}
	
	public void mul()
	{
		int c = a*b;
		System.out.println("Multiplication: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass obj = new NormalClass();
		obj.div();
		obj.mul();

	
		
	}

}
