package practice;

public class ThisMethod {
	
	public void add()
	{
		int a = 10;
		int b =90;
		System.out.println("Add:"+(a+b));
	}
	
	public void name(String name)
	{
		this.add();
	 System.out.println("Name:"+name);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisMethod obj = new ThisMethod();
		obj.name("Shyama");

	}

}
