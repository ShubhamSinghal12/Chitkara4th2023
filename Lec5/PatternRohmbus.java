package Lec5;

public class PatternRohmbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		int val = 1;
		
		while(row <= 2*n-1)
		{
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			
			int cval = val;
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print(cval+" ");
				if(cst <= nst/2)
				{
					cval++;
				}
				else
				{
					cval--;
				}
				
			}
			
			if(row < n)
			{
				nst += 2;
				nsp -= 1;
				val += 1;
			}
			else
			{
				nst -= 2;
				nsp += 1;
				val -= 1;
			}
			System.out.println();
			row++;
		}

	}
	
	

}
