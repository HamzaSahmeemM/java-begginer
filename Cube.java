package datas;
import java.util.*;

public class Cube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number ;
		System.out.print("Enter a number : ");
		number = sc.nextInt();
		sc.close();
		System.out.println("cube of " +number + " = "+ number*number*number);

	}

}
