package practice;

public class YearClass {
	
	int year;
	String month;
	
	public YearClass(int y, String m)
	{
		year = y;
		month = m;
		System.out.println("Year: "+year);
		System.out.println("Month: "+month);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YearClass obj = new YearClass(2011,"Jan");

	}

}
