package datas;
import java.util.*;
public class Diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 , num2 , diff;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		num2 = sc.nextInt();
		sc.close();
		diff = num1 - num2 ;
		System.out.println(num1+ " - "+ num2+" = "+diff);
		
	}

}
