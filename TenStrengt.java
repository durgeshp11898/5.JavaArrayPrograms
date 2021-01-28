
class Add
{

	int addition(int no1,int no2)
	{
		int c=no1+no2;
		return c;
	}
}
class TenStrengt
{

        public static void main(String args[])
        {
                int a[]={1,2,3,4,5,6,7,8,9};

                int i=0,j=0;
		Add A=new Add();

                for(i=0;i<a.length-2;i++);
                {
                        int sum=0;
			int x=a[i];
			int y=a[i+1];
			sum=A.addition(x,y);
			a[i+1]=sum;
			a[i]=0;


                        //a[a.length]--;

                        for(j=0;j<a.length;j++)
                        {
                                System.out.print(a[j]+" ");
                        }
                        System.out.println();
                }

        }
}

