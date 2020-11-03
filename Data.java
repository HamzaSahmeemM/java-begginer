package datas;
import java.util.*;

public class Data {

	public static void main(String[] args) {
		
		int num1 , num2 , sum ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		num2 = sc.nextInt();
		sc.close();
		sum = num1 + num2 ;
		System.out.println( num1 + " + " + num2 + " = " +sum);
	}

}
