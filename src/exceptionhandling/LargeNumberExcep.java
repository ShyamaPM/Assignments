package exceptionhandling;

public class LargeNumberExcep {
	
	public void largeNumber(int a) throws LargeNumberException
	{
		if(a<10)
		{
			//System.out.println("A is less than 10");
			throw new LargeNumberException("A is less than 10");
		} else {
			System.out.println("A is greater than 10");
		}
	}

	public static void main(String[] args) throws LargeNumberException {
		// TODO Auto-generated method stub
		LargeNumberExcep obj = new LargeNumberExcep();
		obj.largeNumber(7);

	}

}
