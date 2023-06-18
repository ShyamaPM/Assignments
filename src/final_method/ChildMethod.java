package final_method;

public class ChildMethod extends ParentMethod{
	
	public void display()
	{
		System.out.println("Child Class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildMethod obj = new ChildMethod();
		obj.display();

	}

}
