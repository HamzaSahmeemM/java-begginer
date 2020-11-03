package datas;
import java.util.*;
public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		sc.close();
		if (number % 2 == 0) {
			if (number % 5 == 0) {
				System.out.println(number +" is divisible by 2 And 5");
			}
		}else {
			System.out.println(number +"is Not divisible by 2 And 5 ");
		}
	}

}
