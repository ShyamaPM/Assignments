package interfacetoclass;

public class NormalClass implements InterfaceClass{
	
	public void div()
	{
		int b = a/2;
		System.out.println("Div: " +b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass obj = new NormalClass();
		obj.div();
		InterfaceClass.even();
		
		

	}

}
