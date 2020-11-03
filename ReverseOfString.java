package datas;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original , reverse = " " ;
		System.out.println("Enetr a string ");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		sc.close();
		int len = original.length();
		for (int i = len-1 ; i >= 0; i--) {
			reverse = reverse+ original.charAt(i);
		}System.out.println("Reverse string is "+reverse);
	}

}
