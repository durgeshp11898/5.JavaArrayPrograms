import java.util.*;
class 2darrayalloperationsSWITCHcase
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int choice;
	
		System.out.println("Enter Array Size   :");
		int size=sc.nextInt();

		int Arr[]=new int[size];

		System.out.println("Enter Array Elements   :");

		for(i=0;i<Arr.length;i++)
		{
			System.out.print("Enter "+i+" Element   :");
			Arr[i]=sc.nextInt();
		}

		System.out.println(" Array Elements   :");

                for(i=0;i<Arr.length;i++)
                {
                        System.out.print(" "+Arr[i]);
                        
                }
		System.out.println();
		System.out.println();
		while(true)
		{
			System.out.println("1:	Find Biggest element in An Array  :");
			System.out.println("2:	Find Smallest element in An Array  :");
			System.out.println("3:	Display Element An Even Index :");
			System.out.println("4:	Display Element at Odd Index  :");
			System.out.println("5:	Count Eveen Number present  in An Array  :");
			System.out.println("6:	Count Odd Number in An Array  :");
			System.out.println("7:	Find Sum Of Array & - smallest element in array :");

			System.out.println();
			System.out.println("Enter Your Choice  :");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:
					int max = Arr[0];
         				for (i = 1; i < Arr.length; i++)
					{
           				  if (Arr[i] > max)
                				 max = Arr[i];		
					}
        				 System.out.println("Maximum Number is       "+ max);
					 System.out.println();
					break;
				case 2:
					int min = Arr[0];
                                        for (i = 1; i < Arr.length; i++)
                                        {
                                          if (Arr[i] < min)
                                                 min = Arr[i];
                                        }
                                         System.out.println("Minimum  Number is       "+min);
                                         System.out.println();
                                        break;
				case 3:
					int cnt=0;
                                         System.out.println("Even Position Numbers     :");
						for (i = 0; i < Arr.length; i++)
                                	        {
                                        		  if(i%2==0)
								System.out.print("  "+Arr[i]);
							  cnt++;
						}
						System.out.println();
						break;
				case 4:
					
                                         System.out.println("Odd Position Numbers     :");
                                                for (i = 0; i < Arr.length; i++)
                                                {
                                                          if(i%2!=0)
                                                                System.out.print("  "+Arr[i]);
                                                          
                                                }
                                                System.out.println();
                                                break;
                                 case 5:
					       	int cnt1=0;
                                      	        System.out.println("Even  Numbers     :");
                                                for (i = 0; i < Arr.length; i++)
                                                {
                                                          if(Arr[i]%2==0)
								{
                                                                System.out.print("  "+Arr[i]);
                                                         	 cnt1++;
								}
                                                }
						System.out.println("Count of Even Numbers   :"+cnt1);
                                                System.out.println();
                                                break;
				case 6:
						int cnt2=0;
					
                                                System.out.println("Odd  Numbers     :");
                                                for (i = 0; i < Arr.length; i++)
                                                {
                                                          if(Arr[i]%2!=0)
                                                                {
                                                                System.out.print("  "+Arr[i]);
                                                                 cnt2++;
                                                                }
                                                }
                                                System.out.println("Count of Even Oddd   :"+cnt2);
                                                System.out.println();
                                                break;
				case 7:
						int min1 = Arr[0];
                                                for (i = 1; i < Arr.length; i++)
                                                 {
                                                         if (Arr[i] < min1)
                                                         min1 = Arr[i];
                                                 }
						
						int sum=0;
                                                System.out.println("Sum of Array  Numbers     :");
                                                for (i = 0; i < Arr.length; i++)
                                                {
                                                          sum=sum+Arr[i];
                                                            
                                                }
                                                System.out.println("Sum Of Numbers Numbers   :"+sum);

						System.out.println();
						int abc=sum-min1;
                                                System.out.println("Sum Of Numbers Numbers - smallest  :"+abc);

                                                break;
				default:
						System.out.println("Enter Correct choice  ");


                                        
                                        


			}
		}


	}
}
