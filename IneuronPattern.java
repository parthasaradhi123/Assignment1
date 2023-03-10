package fullStackJava;

public class IneuronPattern {

	public static void main(String[] args) 
	{
		 

		int n= 12;
		int i;
		int j;
		for( i=0;i<n;i++)
		{
				for(j=0;j<n;j++)
				{
				 if(j ==(n-1)/2 ||  i==0  || i== n-1)
						 
					 {
						 System.out.print("I");
					 }
					 else
					 {
						 System.out.print(" ");
					 }	
				}
				System.out.print(" ");
				System.out.print(" ");
				for( j=0;j<n;j++)
				{
					 if(i==j ||  j==0  || j== n-1)
							 
						 {
							 System.out.print("N");
						 }
						 else
						 {
							 System.out.print(" ");
						 }
			
			   }
				System.out.print(" ");
				System.out.print(" ");
				for( j=0;j<n;j++)
				{
					 if(i==0 ||  j==0  || i== n-1 || i == (n-1)/2)
							 
						 {
							 System.out.print("E");
						 }
						 else
						 {
							 System.out.print(" ");
						 }
			
			   }
				System.out.print(" ");
				System.out.print(" ");
				for( j=0;j<n;j++)
				{
					 if(i==n-1 &&j>0 && j<n-1  ||  j==0 && i<n-1 || j== n-1 && i<n-1 )
							 
						 {
							 System.out.print("U");
						 }
						 else
						 {
							 System.out.print(" ");
						 }
			
			   }

				System.out.print(" ");
				System.out.print(" ");
				for( j=0;j<n;j++)
				{
					 if(i==0 &&j>0 && j<n-1    ||  j==0 && i>0 ||j==n-1 && i>0 && i<=(n-1)/2||i == (n-1)/2 ||
							 i>= (n-1)/2 && j >= (n-1)/2 &&i==j)
							 
						 {
							 System.out.print("R");
						 }
						 else
						 {
							 System.out.print(" ");
						 }
			
			   }
				System.out.print(" ");
				System.out.print(" ");

				 for(j=0;j<n;j++)
				 {
					 if((i==0 && j>0 && j<n-1)||
					   (j== 0 && i>0 && i<n-1)||
					   (i == n-1 && j>0 && j<n-1)||
					   (j == n-1 && i>0 && i<n-1))
							 
					 {
						 System.out.print("0");
					 }
					 else
					 {
						 System.out.print(" ");
					 }
				 }
				 System.out.print(" ");
					System.out.print(" ");
					for( j=0;j<n;j++)
					{
						 if(i==j ||  j==0  || j== n-1)
								 
							 {
								 System.out.print("N");
							 }
							 else
							 {
								 System.out.print(" ");
							 }
				
				   }
				 System.out.println();
		   }
				 
	}

}

