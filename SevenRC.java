class SevenRC
{
	public static void main(String args[])
	{
		int Arr[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,16},{17,18,19,20,21},{22,23,24,25,26}};
		int sum=0;
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<=2;j=j+2)
			{
				sum=sum+Arr[i][j];
				System.out.print(Arr[i][j]+" ");
			}
		System.out.println();
		}
		System.out.println("Sum Of 0th 2nd Columns are  :"+sum);
		
	}
}
