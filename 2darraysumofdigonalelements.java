import java.util.*;
class 2darraysumofdigonalelements.java
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		int i=0,j=0,sum=0;
		/*System.out.println("Enter Size of Row in Array   :");
		int row=sc.nextInt();
		System.out.println("Enter Size of Column in Array   :");
                int column=sc.nextInt();

		int Arr[][]=new int[row][column];
		*/
		int Arr[][]=new int[5][5];

		System.out.println("Enter Elements in Array  :");

                for(i=0;i<Arr.length;i++)
                {
                        for(j=0;j<Arr[i].length;j++)
                        {
                                System.out.print("Enter Arr["+i+"]["+j+"]   :");
                                Arr[i][j]=sc.nextInt();
                                System.out.println();
                        }
                }

		for(i=0;i<Arr.length;i++)
                {
                        for(j=0;j<Arr[i].length;j++)
                        {
                                System.out.print(Arr[i][j]+" ");
                                
  			}
			System.out.println();
                }
		
		System.out.println();

		for(i=0;i<Arr.length;i++)
                {
                        for(j=0;j<Arr[i].length;j++)
                        {
                                if((i==j || i+j==4))
				{	
					System.out.print(Arr[i][j]+" ");
					sum=sum+Arr[i][j];
				}
				else
					System.out.print(" ");
                        }
			System.out.println();
                }
		System.out.println("Sum Of Diagonals are  :"+sum);
	}
}

