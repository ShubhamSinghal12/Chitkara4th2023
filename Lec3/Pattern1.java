package Lec3;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int row = 1;
		int nsp = n-1;
		int nst = 1;
		while(row <= n)
		{
			for(int csp = 1; csp <= nsp; csp++)
			{
				System.out.print("  ");
			}
			
			for(int cst = 1;cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			
			nsp--;
			nst++;
			System.out.println();
			row++;
		}

	}

}
