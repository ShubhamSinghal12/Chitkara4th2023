package Lec3;

public class Pattern2 {

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
				if(cst%2 != 0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			nsp--;
			nst += 2;
			System.out.println();
			row++;
		}

	}

}
