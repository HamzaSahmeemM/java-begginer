package datas;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number , reverse = 0;
		System.out.println("Enter number to check : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.close();
		int temp = number ;
		while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
		}
		if (temp == reverse) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindome");
	}

}
