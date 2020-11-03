package datas;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number");
		number = sc.nextInt();
		sc.close();
		if (number % 2 == 0) {
			System.out.println(number +" is An Even number ");
		}
		else {
			System.out.println(number +" Is Not an odd number not an even ");
		}
	}

}
