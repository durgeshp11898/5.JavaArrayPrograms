import java.util.*;

class ArraySumDyanmic
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of An Array   ");
		int size=sc.nextInt();
		int i=0,j=0;
		int sum=0;

		int arr[]=new int[size];
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+i+" index: ");
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
			sum=sum+arr[i];
		}
		System.out.println();
		System.out.println("sum of Array is  "+sum);
	}
}


