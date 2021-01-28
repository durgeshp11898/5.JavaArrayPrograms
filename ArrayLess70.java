class ArrayLess70
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=40;
		a[1]=80;
		a[3]=60;
		a[2]=660;
		a[4]=10;

		int i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<=70)
			{
				System.out.print("  "+a[i]);
			}
		}
	}
}
