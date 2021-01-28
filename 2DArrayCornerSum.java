import java.io.*;
import java.util.*;
class 2DArrayCornerSum
{
	public static void main(String args[])
	{
		int i=0,j=0,sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size Of Row  :");
		int p=sc.nextInt();

		System.out.println("Enter Size Of Column  :");
                int q=sc.nextInt();

		int arr[][]=new int[p][q];

		System.out.println("Enter Array Elements of size ROW & Column "+p+"*"+q+"  :");

		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				System.out.print("Enter Row "+i+" Enter Column "+j+"   :");
				arr[i][j]=sc.nextInt();
			}
		System.out.println();
		}
		for(i=0;i<p;i++)
		{
			for(j=0;j<q;j++)
			{
				System.out.print(" "+arr[i][j]+" ");
			}
		System.out.println();
		}

		for(i=0;i<p;i++)
                {
                        for(j=0;j<q;j++)
                        {
				if(i==0 ||j==0 ||i==p-1 || j==q-1)
				{
                               
				sum=sum+arr[i][j];
				}

                        }
                System.out.println();
                }
		System.out.println(sum);

	}


}	
