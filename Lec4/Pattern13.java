package Lec4;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		int nst = 1;
		int row = 1;
		while(row <= 2*n-1)
		{
			for(int cst = 1; cst <= nst; cst++)
			{
				System.out.print("* ");
			}
			if(row < n)
			{
				nst++;
			}
			else
			{
				nst--;
			}
			row++;
			System.out.println();
		}

	}

}
