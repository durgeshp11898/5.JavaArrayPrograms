import java.util.*;
class 2dArraysumofcornerelements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int i=0,j=0;
		System.out.println("Enter Size of Row  :");
                int row=sc.nextInt();
                
                System.out.println("Enter Size of Column  :");
                int col=sc.nextInt();        

                int Arr[][]=new int[row][col];

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
		int sum=0;
		sum=Arr[0][0] + Arr[0][row-1] +Arr[col-1][0] + Arr[col-1][row-1] ;

		System.out.println("Sum OF Corner Elements IS   :"+sum);
	}
}




