class ArrayOdd
{
	public static void main(String args[])
	{
		int a[]=new int[6];
		       a[0]=10;
		       a[1]=11;
		       a[2]=13;
		       a[3]=12;
		       a[4]=17;
		       a[5]=45;

		       int i=0,sum=0;

		       for(i=0;i<a.length;i++)
		       {
			       if(a[i]%2!=0)
			       {
				       sum=sum+a[i];
				       System.out.print("  "+a[i]);
				}
			}
		       System.out.println();
		       System.out.println("Sum of odd is "+sum);
	 
	}
}
       			       
