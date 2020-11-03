package datas;

import java.util.Scanner;

public class FloydsTRiangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows , number = 1 ;
		System.out.println("Enter no.of rows ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		sc.close();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println("");
			
		}

	}

}
