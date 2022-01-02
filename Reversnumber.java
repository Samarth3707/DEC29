package Assignment;

public class Reversnumber {
	
	public static void Revers(int num)
	{
		if(num<10)
		{
			System.out.println(num);
		}
		else
		{
			System.out.print(num%10);
			Revers(num/10);
		}
		
	}
	public static void main(String[] args)
	{
		int num=1234;
		
		System.out.print("reversed number is : ");
		Revers(num);
	}

}
