package Lec7;

public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int[] brr = {5,4,3,2,1};
		
		System.out.println(arr[0]+" "+brr[0]);
		swap(arr, brr,0);
		System.out.println(arr[0]+" "+brr[0]);

	}
	
	public static void swap(int[] arr,int[] brr,int i)
	{
		int t = arr[i];
		arr[i] = brr[i];
		brr[i] = t;
	}

}
