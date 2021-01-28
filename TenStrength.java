class TenStrength
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};

		int i=0,j=0;
		for(i=0;i<a.length/3;i++)
		{
			a[i+1]=a[i+1]+a[i];
			a[i]=0;

			a[a.length-i-1-1]=a[a.length-i-1-1]+a[a.length-i-1];
			a[a.length-i-1]=0;

			for(j=0;j<a.length;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	
	}
}
