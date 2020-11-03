package datas;
import java.util.*;
public class Large {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num1 , num2 ;
		System.out.println("Enter First number : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second number : ");
		num2 = sc.nextInt();
		sc.close();
		if (num1 > num2) {
			System.out.println(num1+" is greater");
		}
		else {
			System.out.println(num2+" is greater");
		}
	}

}
