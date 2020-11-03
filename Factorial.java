package datas;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number , fact =1;
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		sc.close();
		for (int i = 1; i <=number; i++) {
			fact = fact*i;
			
		}
		System.out.println("factorial of "+number+" is "+fact);
	}

}
