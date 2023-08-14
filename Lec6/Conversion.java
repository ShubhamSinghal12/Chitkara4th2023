package Lec6;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 0;
		int max = 100;
		int step = 20;
		
		for(int f = min; f<= max; f+= step)
		{
			int c = 5*(f-32)/9;
			System.out.println(c);
		}
		

	}

}
