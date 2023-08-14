package Lec2;

public class SumofDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 99999992;
		int count = 0;
		while(n >= 10)
		{
			count++;
			int sum = 0;
			while(n > 0)
			{
				sum += n%10;
				n = n/10;
			}
			System.out.println(sum);
			n = sum;
		}
		System.out.println("Count: "+ count);
	}
}
