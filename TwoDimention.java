package Array.Ass;
import java.util.*;

public class TwoDimention
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		int choice;
		int Arr[][]= {{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{1,2,3,4,5},{5,4,3,2,1}};
	/*
		System.out.println("Enter Row Size   :");
		int row=sc.nextInt();
		
		System.out.println("Enter Column Size   :");
		int column=sc.nextInt();

		int Arr[][]=new int[row][column];
		
		System.out.println("Enter Array Elements   :");

		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
			System.out.print("Enter Arr["+i+"]["+j+"] Element   :");
			Arr[i][j]=sc.nextInt();
			}
		}*/
		System.out.println();
		System.out.println(" Array Elements   :");
		System.out.println();
        for(i=0;i<Arr.length;i++)
        {
        	for(j=0;j<Arr[i].length;j++)
            {
        		System.out.print(" "+Arr[i][j]);
            }
         System.out.println();
         }	
       // while(true)
	}
}
