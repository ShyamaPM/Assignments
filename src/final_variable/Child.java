package final_variable;

public class Child extends Parent{
 int c= 10;
	
	public void mul()
	{
	//	a=3;
		int b = 9;
		System.out.println("Multiplication: "+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child obj = new Child();
		obj.mul();
		obj.add();
		System.out.println("Final value:"+obj.c);

	}

}
