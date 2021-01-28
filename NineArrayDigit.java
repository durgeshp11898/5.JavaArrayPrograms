import java.util.*;
class NineArrayDigit
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
			System.out.print("Enter "+i+" Element  :");
			a[i]=sc.nextInt();
		}
		System.out.println("	Array	:");  
		for(i=0;i<a.length;i++)
                {
                        System.out.print("  "+a[i]);
                }
		
		System.out.println(":	Elements Which Addition >10	:");

		for(i=0;i<a.length;i++)
                {
			int no=a[i],sum=0,rem=0;
			while(no!=0)
			{
				rem=no%10;
				sum=sum+rem;
				no=no/10;
			}
			if(sum>10)

                        	System.out.print("  "+a[i]);
                }
	}
}
