import java.util.*;
class CheckSquareElementsisPresernt
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size   :");
		int size=sc.nextInt();

		int i=0,j=0;
		 
		int a[]=new int[size];
		
		System.out.println("Enter Array Elements  :");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element  :");
			a[i]=sc.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			int square=a[i]*a[i];

			for(j=0;j<a.length;j++)
			{
				if(square==a[j])
					System.out.print(a[i]+"  ");
			}
		}
	}
}
