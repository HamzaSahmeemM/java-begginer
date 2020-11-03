package datas;

import java.util.Scanner;

public class DaysInWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		day = sc.nextInt();
		sc.close();
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monnday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wenesday");
			break;
		case 5:
			System.out.println("Thurseday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;


		default:
			System.out.println("Enter a valied number between 1 to 7");
			break;
		}
	}

}
