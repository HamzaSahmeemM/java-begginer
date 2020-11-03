package datas;

import java.util.Scanner;
public class UserDefindException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		try {
			validate(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured: "+e);
		}
		
	}
	static void validate(int num) throws myclass{
		int num1= num;
		if(num1 <18) {
			throw new myclass("sorry not eligible");
		}
	}
}

class myclass extends Exception{
	myclass(String s){
		super(s);
	}
}

