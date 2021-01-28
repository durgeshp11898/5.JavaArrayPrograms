
import java.util.*;

public class Duplets
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size  :");
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
		
		System.out.println("Duplets are  :");
		System.out.println();
		for(i=0;i<Arr.length-1;i++)
		{
			Arr[i]=Arr[i];
			for(j=i+1;j<Arr.length;j++)
			System.out.print(" "+"("+Arr[i]+","+Arr[j]+ ")");
		}
	}

}

