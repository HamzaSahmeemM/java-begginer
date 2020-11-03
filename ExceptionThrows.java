package datas;

import java.util.Scanner;

public class ExceptionThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter A number");
		Scanner sc= new Scanner(System.in);
		run(sc.nextInt());
	}
static void run(int num) throws ArithmeticException{
	int num1=num;
	if(num1<18) {
		throw new ArithmeticException("Sorry not found");
	}
}

}

