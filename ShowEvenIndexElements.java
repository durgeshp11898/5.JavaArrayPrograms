import java.util.*;
class ShowEvenIndexElements
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter The Size Of An Array   ");
                int size=sc.nextInt();
                int i=0,j=0;
                int sum=0;

                int arr[]=new int[size];

                for(i=0;i<arr.length;i++)
                {
                        System.out.print("Enter "+i+" index: ");
                        arr[i]=sc.nextInt();
                }
                System.out.println();
                for(i=0;i<arr.length;i++)
                {
                       // System.out.print(" "+arr[i]);
                        if(i%2==0)
                        {
                                // System.out.println();
                                 System.out.println("even index of Array is  "+arr[i]+"at index "+i);
                        }
                }
        }
}
