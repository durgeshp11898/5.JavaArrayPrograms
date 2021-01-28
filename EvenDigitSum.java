import java.util.*;
class EvenDigitSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Number to find Even Sum  ");
		int no=sc.nextInt();

		int sum=0;
		int digit=0;

		while(no!=0)
		{
			digit=no%10;
			if(digit%2==0)
			{
				sum=sum+digit;
			}
			no/=10;
		
		}
		System.out.println("Sum of Even Numbers "+sum);

	}
}
