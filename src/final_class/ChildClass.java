package final_class;

public class ChildClass //extendsParentClass
{
	
	public void add()
	{
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass obj = new ChildClass();
		obj.add();
		//obj.display();

	}

}
