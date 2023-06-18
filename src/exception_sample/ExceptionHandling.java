package exception_sample;

public class ExceptionHandling {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4;
		
		int arr[][]=new int[2][2];
		arr[0][0] = 2;
		arr[0][1] = 4;
		arr[1][0] = 6;
		arr[1][1] = 8;
		
		try
		{
			
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(" ");
		}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
			System.out.println(e);
		}
		finally
		{
			if(k%2==0)
			{
				System.out.println(k+ "Even number");
			} else {
				System.out.println(k+ "Odd number");
			}
				
		
		}

	}

}
