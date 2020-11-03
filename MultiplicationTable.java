package datas;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number  : ");
		number = sc.nextInt();
		sc.close();
		for (int i = 1; i < 10; i++) {
			System.out.println(i+" * " +number +" = " +(i*number));
		}
		
		
	}

}
