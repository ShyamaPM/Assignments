package exception_sample;

public class ThrowException {
	
	public static void odd(int i)
	{
		if(i%2==0)
		{
			throw new ArithmeticException("Even number");
		} else {
			System.out.println("Odd number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException.odd(8);

	}

}
