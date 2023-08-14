package Lec2;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1234;
		int sum = 0;
		while(n > 0)
		{
			sum += n%10;
			n = n/10;
		}

	}

}
