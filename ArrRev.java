class ArrRev
{
	public static void main(String args[])
	{
		int i=0,j=0;
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		for(j=a.length-1;j>=0;j--)
		{
			System.out.print(a[j]+"  ");
		}

	}
}
