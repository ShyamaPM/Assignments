package polymorphism;


// Test 123
public class ChildA extends ParentA{
	
	public void increment()
	{
		super.increment();
		System.out.println("Increment from 5 to 10 - Child Class");
		for(int i=5;i<=10;i++)
		{
			System.out.println(i);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildA obj = new ChildA();
		obj.increment();

	}

}
