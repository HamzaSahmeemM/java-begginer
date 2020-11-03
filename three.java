package datas;
import java.util.*;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 , num2 , num3 ;
		System.out.println("Enter First Number  : ");
		num1 = sc.nextInt();
		System.out.println("Enter Second Number  : ");
		num2 = sc.nextInt();
		System.out.println("Enter Third Number  : ");
		num3 = sc.nextInt();
		sc.close();
		if (num1 > num2 ) {
			if (num1 > num3) {
				System.out.println("Gretest is : "+ num1);
			}else {
				System.out.println("Gretest is : "+ num3);
			}
		}else if (num2 > num3) {
			System.out.println("Gretest is : "+ num2);
		}
		else{
			System.out.println("Gretest is : " +num3);
		}
	}

}
