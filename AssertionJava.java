package datas;

import java.util.Scanner;

public class AssertionJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number ");
		Scanner sc =new Scanner(System.in);
		int value = sc.nextInt();
		assert value>=18: "Not valid";
		  System.out.println("value is "+value); 
	}

}
