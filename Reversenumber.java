package datas;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number , reverse = 0 , digit ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		number = sc.nextInt();
		sc.close();
		int temp = number ;
		while (number != 0) {
			digit = number % 10 ;
			reverse = reverse * 10 + digit ;
			number /= 10;
		}
		
			System.out.println("reverse of "+temp+" is "+reverse);
	}

}
