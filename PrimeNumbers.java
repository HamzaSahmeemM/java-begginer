package datas;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number ;
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check : ");
		number = sc.nextInt();
		sc.close();
		for (int i = 2; i <= number/2 ; ++i) {
			if(number%i == 0) {
			flag = true;
			break;
			}
		}
		if(!flag) {
		System.out.println("Prime");
		}
		else
			System.out.println("Not a prime");

	}

}
