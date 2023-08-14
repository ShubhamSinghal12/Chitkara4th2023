package Lec3;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		int nst = n;
		while(row <= n)
		{
			for(int cst = 1; cst <= nst; cst++)
			{
				if(cst == row || cst+row == n+1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			row++;
			System.out.println();
		}

	}

}
