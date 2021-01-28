import java.util.Scanner;
import java.io.*;
class Two
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter Array Size  :");
		int size=sc.nextInt();

		int Arr[]=new int[size];

		System.out.println("Enter "+size+" Elements of arrray  :");

		for(i=0;i<Arr.length;i++)
		{
			System.out.println("Enter "+i+" Element   :");

			Arr[i]=sc.nextInt();
		}

		System.out.println("Divided by 11 numbers :");
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]%11==0)
			
				System.out.print(Arr[i]+"  ");
		}
	}
}
		
