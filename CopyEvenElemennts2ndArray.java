import java.util.Scanner;
import java.io.*;
class CopyEvenElemennts2ndArray
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                int i=0,sizee=0,j=0,k=0;
                System.out.println("Enter Array Size  :");
                int size=sc.nextInt();

                int Arr[]=new int[size];
		
                System.out.println("Enter "+size+" Elements of arrray  :");

                for(i=0;i<Arr.length;i++)
                {
                        System.out.println("Enter "+i+" Element   :");

                        Arr[i]=sc.nextInt();
                }

                System.out.println("numbers at even position:");
                sizee=Arr.length/2;

		int Brr[]=new int[sizee+1];
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			{
				Brr[j]=Arr[i];
				j++;
			}
		}
		 for(i=0;i<Brr.length;i++)
                {
                      System.out.print(" "+Brr[i]);


                }
        }
}
