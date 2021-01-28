import java.util.*;

class FiveArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		System.out.println("Enter Array Size	:");
		int size=sc.nextInt();
		
		int Arr[]=new int[size];

		System.out.println("Enter Array Elements 	:");
		for(i=0;i<Arr.length;i++)
		{
			System.out.print("Enter "+i+1+" Element	:");
			Arr[i]=sc.nextInt();

		}
		
		System.out.println("Array ");

		 for(i=0;i<Arr.length;i++)
                {
                        System.out.print(" "+Arr[i]);
                        
		}
		System.out.println();

		int Even[]=new int[5];
		int Odd[]=new int[5];
		int Ecnt=0,Ocnt=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]%2==0)
			
				Even[Ecnt++]=Arr[i];
			
			else
				Odd[Ocnt++]=Arr[i];
		}
		int y=0;
		for(int k=0;k<Even.length;k++)
		{
			System.out.print(" "+Even[k]);
		}
		for(int k=0;k<Odd.length;k++)
                {
                        System.out.print(" "+Odd[k]);
                }

	}
}
