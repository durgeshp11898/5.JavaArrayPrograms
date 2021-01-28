class Test
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,6,7,8,9};
		int i=0,j=0,k=0,x=0,y=0;
		for(i=0;i<a.length/2-1;i++)
		{
			
			a[i+1]=a[i]+a[i+1];
			a[i]=0;

			for(j=0;j<a.length;j++)
			{

			System.out.print(a[j]+" ");
			}
//		System.out.println();
		}
		for(k=a.length-1;k>=6;k--)
	         {

			a[k-1]=a[k]+a[k-1];
                        a[k]=0;


                        for(x=0;x<a.length;x++)
                        {

                        System.out.print(a[x]+" ");
                        }

                System.out.println();
		}

}	}
