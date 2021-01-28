import java.util.*;
import java.io.*;

class HourseChessProblem
{
	public static void main(String args[])
	{
		int i=0,j=0,p=0,q=0,a=0,b=0;
		int m=0,n=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Size of ROW in Array  ");
		m=sc.nextInt();

		System.out.println("Enter The Size of Column in Array  ");
                n=sc.nextInt();

		int arr[][] = new int[m][n];

		System.out.println("Enter Row Position");
                i=sc.nextInt();
                System.out.println("Enter Column Position");
                j=sc.nextInt();
		
		for(a=0;a<m;a++)
		{
			for(b=0;b<n;b++)
			{
				arr[a][b]=0;
				if(a==i && b==j)
				{
					arr[a][b]=1;
					System.out.print(" "+arr[a][b]+" ");
				}

	
				else
					System.out.print(" "+arr[a][b]+" ");
			}
			
			System.out.println();
			System.out.println();
		}
		


              /*  if (i - 2 >= 0 && j + 1 <arr.length) {
                        arr[i - 2][j + 1] = 2;


                }System.out.println();


                  if(i-2>=0 && j-1>=0)
                  {
                          arr[i-2][j-1]=2;
                  }
                  if(i-1>=0 && j-2>=0)
                  {
                          arr[i-1][j-2]=2;
                  }
                  if(i+1<arr.length && j-2>=0)
                  {
                          arr[i+1][j-2]=2;
                  }
                  if(i+2<arr.length && j-1>=0)
                  {
                          arr[i+2][j-1]=2;
                  }
                  if(i+2<arr.length && j+1<arr.length)
                  {
                          arr[i+2][j+1]=2;
                  }
                  if(i+1<arr.length && j+2<arr.length)
                  {
                          arr[i+1][j+2]=2;
                  }*/
                  if(i-1>=0 && j+2<arr.length)
                  {
                          arr[i-1][j+2]=2;
                  }

                  for( p =0;p<arr.length;p++)
                  {
                          for(q=0;q<arr.length;q++)
                          {

                                 System.out.print("   "+arr[p][q]+" ");
                          }
		            System.out.println();
			    System.out.println();
		 }
	}
}







                                                                                                                                       

