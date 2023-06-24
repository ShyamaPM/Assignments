package practice;

public class ThisVar {
	
	int year;
	
	public void display(int year)
	{
		this.year = year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisVar obj = new ThisVar();
	    obj.display(2019);
	    System.out.println(obj.year);

	}

}
