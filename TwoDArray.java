import java.util.*;

class TwoDArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0,j=0;
		int choice;

	
		System.out.println("Enter Row Size   :");
		int row=sc.nextInt();

		System.out.println("Enter Column Size   :");
		int column=sc.nextInt();

		int Arr[][]=new int[row][column];

		System.out.println("Enter Array Elements   :");

		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
			System.out.print("Enter Arr["+i+"]["+j+"] Element   :");
			Arr[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		System.out.println(" Array Elements   :");
		System.out.println();
       		 for(i=0;i<Arr.length;i++)
       		 {
        		for(j=0;j<Arr[i].length;j++)
        		{	
        			System.out.print(" "+Arr[i][j]);
            		}	
        		 System.out.println();
         	}		
      
		System.out.println();
		while(true)
		{
			System.out.println("1:	Find Sum Of All Element in Array  :");
			System.out.println("2:	Find Sum Of ALL * Position  :");
			System.out.println("3:	Find sum of All Non * Position  :");
			System.out.println("4:	Find Biggest Number in Array  :");
			System.out.println("5:	Find Biggest & Smallest Number in Array  :");
			System.out.println("6:	Copy Elements A[][]=B[][]  :");
			System.out.println("7:	Display Array Using For :");
			System.out.println("8:  Exit:");


			System.out.println();
			System.out.println("Enter Your Choice  :");
			choice=sc.nextInt();

			switch(choice)
			{
				case 1:
					 int sum=0;
					 for(i=0;i<Arr.length;i++)
                 		       	 {
                      				  for(j=0;j<Arr[i].length;j++)
                        			{
                                			sum=sum+Arr[i][j];
                        			}
                         			System.out.println();
                			 }	
					System.out.println("Sum Of 2D Array is   :"+sum);
					System.out.println();
					break;
				case 2:
					int summ=0;
					 for(i=0;i<Arr.length;i++)
                                         {
                                                  for(j=0;j<Arr[i].length;j++)
                                                {
							if(i+j>4)
							{
                                                       		summ=summ+Arr[i][j];
								System.out.print(" "+Arr[i][j]+" ");
							}
							else
								System.out.print(" * ");
						}
                                                System.out.println();
                                         }
                                        System.out.println("Sum Of 2D Array is   :"+summ);
					System.out.println();
					break;

				case 3:
                                        int summm=0;
                                         for(i=0;i<Arr.length;i++)
                                         {
                                                  for(j=0;j<Arr[i].length;j++)
                                                {
                                                        if(i+j<5)
                                                        {
                                                                summm=summm+Arr[i][j];
                                                                System.out.print(" "+Arr[i][j]+" ");
                                                        }
                                                        else
                                                                System.out.print(" * ");
                                                }
                                                System.out.println();
                                         }
                                        System.out.println("Sum Of 2D Array is   :"+summm);
                                        System.out.println();
                                        break;

				case 4:
					System.out.println("Biggest & Smallest Number in 2D Array   :");

					int min=Arr[0][0];
					int max=Arr[0][0];
                                         for(i=0;i<Arr.length;i++)
                                         {
						 
                                                  for(j=0;j<Arr[i].length;j++)
                                                  {
                                                        if(max<Arr[i][j])
							
								max=Arr[i][j];
                                                        
                                                        if(min>Arr[i][j])
								min=Arr[i][j];
                                                                
                                                }
                                                System.out.println();
                                         }
                                        System.out.println("Minimum from 2D ARray  :"+min);
                                        System.out.println("Maximum from 2D Array   :"+max);
					System.out.println();
                                        break;
				case 5:
                                        System.out.println("Biggest Number in 2D Array   :");

                                        
                                        int maxx=Arr[0][0];
                                         for(i=0;i<Arr.length;i++)
                                         {

                                                  for(j=0;j<Arr[i].length;j++)
                                                  {
                                                        if(maxx<Arr[i][j])

                                                                maxx=Arr[i][j];
						   }
                                                System.out.println();
                                         }
                              
                                        System.out.println("Maximum from 2D Array   :"+maxx);
                                        System.out.println();
                                        break;
				case 6:
					System.out.println("Copyied Array is   :");
					int Brr[][]=new int[5][5];
					
					  for(i=0;i<Arr.length;i++)
                			  {
                        		  	for(j=0;j<Arr[i].length;j++)
                        			{
                        				Brr[i][j]=Arr[i][j];
							System.out.print(" "+Brr[i][j]);
                        			}
						System.out.println();
				       	   }
					  System.out.println();
					  break;
				case 7:
					  System.out.println("Display Array Arr & Brr using for each loop   :");

					  
					  for(int[] u: Arr)
					  {  
						  for(int v:u)
						  {
   							System.out.print(v+" ");
						  }
						  System.out.println();
				       	  }						
					  break;
				case 8:
					  System.exit(0);
					  break;
				default:
					  System.out.println("Enter Correct Choice  :");
			}
		}
	}
}
