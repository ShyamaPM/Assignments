package abstractsample;

public class NormalClass extends AbstractClass1 {
	
	public void add()
	{
		int c= 10, d = 4;
		System.out.println("Addition: "+(c+d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NormalClass obj = new NormalClass();
		obj.add();
		obj.mul();

	}

}
