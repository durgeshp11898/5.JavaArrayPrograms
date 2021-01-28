import java.util.*;
class DynamicArraySum
{
	public static void main(String args[])
	{
		int i=0,j=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		for( i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" number");
			a[i]=sc.nextInt();
		}
		for(j=0;j<a.length;j++)
		{	sum=sum+a[j];
			System.out.print(" "+a[j]);
		}
		System.out.println();
		System.out.println("Sum is  "+sum);
	}
	
}
