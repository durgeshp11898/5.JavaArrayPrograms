
import java.util.*;

 class Primee
{
	boolean isPrime(int n) 
    { 
        if (n <= 1) 
            return false; 
  
        for (int i = 2; i <= n/2; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    }
}
public class ArrayNonPrime
{
	  
	public static void main(String[] args)
	{
		Primee p=new Primee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size  :");
		int size=sc.nextInt();
		int Arr[]=new int[size];
		int i=0,j=0;
		System.out.println("Enter Array Elements  :");
		for(i=0;i<Arr.length;i++)
		{
			System.out.print("Enter "+i+" Element  :");
			Arr[i]=sc.nextInt();
			
		}
		System.out.println();
		System.out.println("Array ");
		System.out.println();
		for(i=0;i<Arr.length;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		System.out.println();
		//System.out.println("Prime Elements are  :");
		for(i=0;i<Arr.length;i++)
		{
			boolean a=p.isPrime(Arr[i]);
			if(a!=true)
			
			//	System.out.println("Prime number  :"+Arr[i]);
			
		//	else
				System.out.println("Non Prime Number  :"+Arr[i]);
		}
		  
	}
}


