class ArraySumFor
{
	public static void main(String args[])
	{
		int a[] =new int[10];
		int sum=0,i=0;
		a[0]=15;
		a[1]=10;
		a[2]=17;
		a[3]=60;
		a[4]=35;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>=10 && a[i]<=40 && a[i]%5==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
			}
		}
		System.out.println("Sum    "+sum);
	}
}
