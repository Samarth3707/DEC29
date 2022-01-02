package Assignment;

public class Assignment
{
	static int fact(int N)
	{
		if(N!=0)
		{
			return N*fact(N-1);
		}
		else
			return 1;
		
			
		
		
		
			
	}
	
	
	
	public static void main(String[] args)
	{
		int number=6;
		int result=fact(number);
		System.out.println("factorial of "+number+" is "+result);
		
		
		
	}
		

}
