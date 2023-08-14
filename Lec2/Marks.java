package Lec2;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks >= 80)
		{
			System.out.println("A");
		}
		else if(marks >= 60)
		{
			System.out.println("B");
		}
		else if(marks >= 40)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("F");
		}
		

	}

}
