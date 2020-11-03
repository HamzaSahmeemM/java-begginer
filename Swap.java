package datas;
import java.util.*;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 , num2 , flag ;
		System.out.print("Enter First Number : ");
		num1 = sc.nextInt();
		System.out.print("Enter second number : " );
		num2 = sc.nextInt();
		sc.close();
		System.out.println("First number  : "+num1);
		System.out.println("Second number : " +num2);
		flag = num1;
		num1 = num2;
		num2 = flag;
		System.out.println("After Swapping ");
		System.out.println("First number  : "+num1);
		System.out.println("Second number : " +num2);
	}

}
