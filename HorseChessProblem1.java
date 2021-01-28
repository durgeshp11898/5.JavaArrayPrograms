
public class HorseChessProblem1 {
	public static void main(String[] args) {
		int a[][] = new int[8][8];

	

    	int i=3;
		int j = 4;
		a[3][4] = 1;

		if (i - 2 >= 0 && j + 1 <a.length) {
			a[i - 2][j + 1] = 2;
			

		}System.out.println();
		
		
		  if(i-2>=0 && j-1>=0)
		  {
			  a[i-2][j-1]=2;
		  }
		  if(i-1>=0 && j-2>=0)
		  {
			  a[i-1][j-2]=2;
		  }
		  if(i+1<a.length && j-2>=0)
		  { 
			  a[i+1][j-2]=2;
		  } 
		  if(i+2<a.length && j-1>=0)
		  {
			  a[i+2][j-1]=2; 
		  }
		  if(i+2<a.length && j+1<a.length)
		  {
			  a[i+2][j+1]=2;
		  }
		  if(i+1<a.length && j+2<a.length)
		  {
			  a[i+1][j+2]=2;
		  }
		  if(i-1>=0 && j+2<a.length)
		  {
			  a[i-1][j+2]=2;
		  }
		  
		  for(int n =0;n<a.length;n++)
		  {
			  for(int m=0;m<a.length;m++)
			  {
				  
				 System.out.print("  "+a[n][m]);
			  }
			  System.out.println();
			  
		  }
		  
	
	}
}
