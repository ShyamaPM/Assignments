package exception_sample;

public class OddExp {
	
	public void greater(int a) throws OddException
	{
		if(a%2==0)
		{
			//System.out.println("Even number");
			throw new OddException("Even Number");
		} else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) throws OddException {
		// TODO Auto-generated method stub
		
		OddExp obj = new OddExp();
		obj.greater(10);

	}

}
