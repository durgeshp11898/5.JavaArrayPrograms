class MinimumfromArray
{
	public static void main(String args[])
	{
		int i=0;
		int Arr[]={10,20,30,40};
		int min = Arr[0];
		int min1=Arr[0];
                for (i = 1; i < Arr.length; i++)
		{
                      if (Arr[i] < min)
                              min = Arr[i];
		      
                }
		for(i=1;i<Arr.length;i++)
		{
			if(min)

                                         System.out.println("Minimum  Number is       "+min);
                                         System.out.println();
	}
}
