package datas;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int limit , t1 = 0 , t2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit ");
		limit = sc.nextInt();
		sc.close();
		for (int i = 1; i <= limit ; i++) {
			System.out.print(t1+"+");
			int sum = t1 + t2 ;
			t1 = t2 ;
			t2 = sum ;
		}
		
	}

}
