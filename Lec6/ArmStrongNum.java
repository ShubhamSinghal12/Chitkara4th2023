package Lec6;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllArmStrong(1, 1000);

	}
	
	public static int countDigits(int num)
	{
		return (int)Math.log10(num)+1;
	}
	
	public static boolean isArmStrong(int num)
	{
		int temp = num;
		int sum = 0;
		int nod = countDigits(num);
		while(temp != 0)
		{
			sum += Math.pow(temp%10,nod);
			temp /= 10;
		}
		return num == sum;
	}
	
	public static void printAllArmStrong(int si,int ei)
	{
		for(int i = si; i <= ei; i++)
		{
			if(isArmStrong(i))
			{
				System.out.println(i);
			}
		}
	}

}
