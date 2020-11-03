package datas;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name , reverse = "" ;
		System.out.println("Enter String to check ");
		name = sc.nextLine();
		sc.close();
		int n = name.length();
		for (int i = n-1; i >= 0; i--) {
			reverse = reverse +name.charAt(i);
		}
		if (name.equalsIgnoreCase(reverse)) {
			System.out.println(name+" is panlindrome ");
		}
		else {
			System.out.println(name+" is not palindrome ");
		}
	}

}
