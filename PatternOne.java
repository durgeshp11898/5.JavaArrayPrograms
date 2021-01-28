class PatternOne
{
	public static void main(String args[])
	{
		int i=0,j=0;
		char ch='A';
		for(i=1;i<=5;i++)
		{
			ch='A';
			for(j=1;j<=5-i+1;j++)
			{
				System.out.print(ch+" ");
				++ch;
			}
			System.out.println();
		}
		for(i=1;i<=5;i++)
                {
                        ch='A';
                        for(j=1;j<=i;j++)
                        {
                                System.out.print(ch+" ");
                                ++ch;
                        }
                        System.out.println();
                }
	}
}
