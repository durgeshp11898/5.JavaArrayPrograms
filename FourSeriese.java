class FourSeriese
{
	public static void main(String args[])
	{
		int i=0,j=0,k=0;

		for(i=2,j=1,k=3;i<=6 && j<=3 && k<=27;i+=2,j++,k*=3)
		{
			System.out.print(" "+i+" "+j+" "+k+"	" );
		}
	}
}
