package aggregation1;

import aggregation.ClassA;

public class ClassB {
	
	public static void sub()
	{
		int c= 56;
		int d = 46;
		System.out.println("Subtraction: "+(c-d));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA.add();
		ClassB.sub();
		ClassA obj = new ClassA();
		obj.display();
		

	}

}

