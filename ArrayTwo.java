import java.util.*;

class ArrayTwo
{
	public static void main(String args[])
	{
		int i=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Array Size 	:");
		int size=sc.nextInt();
	
		int Arr[]=new int[size];

		System.out.println("Enter Array Elements	");

		for(i=0;i<Arr.length;i++)
		{
			System.out.print("Enter "+i+" Element	:");
			Arr[i]=sc.nextInt();
		}

		for(i=0;i<Arr.length;i++)
                {
                        System.out.print(" "+Arr[i]);
                      
                }

		System.out.println("Divisible by 7  :");

		for(i=0;i<Arr.length;i++)
                {
			if(Arr[i]%7==0)
                       		System.out.print(" "+Arr[i]);

                }
	}
	
}
