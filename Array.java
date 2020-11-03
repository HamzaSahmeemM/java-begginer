package datas;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers [] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Array insertion without loop ");
		System.out.println("Enter numbes to the Array : ");
		System.out.println("Enter First number  : ");
		numbers[0] = sc.nextInt();
		System.out.println("Enter Second number  : ");
		numbers[1] = sc.nextInt();
		System.out.println("Enter Third number  : ");
		numbers[2] = sc.nextInt();
		System.out.println("Enter Fourth number  : ");
		numbers[3] = sc.nextInt();
		System.out.println("Enter Fifth number  : ");
		numbers[4] = sc.nextInt();
		System.out.println("Enter Sixth number  : ");
		numbers[5] = sc.nextInt();
		System.out.println("Enter Seventh number  : ");
		numbers[6] = sc.nextInt();
		System.out.println("Enter Eighth number  : ");
		numbers[7] = sc.nextInt();
		System.out.println("Enter Nineth number  : ");
		numbers[8] = sc.nextInt();
		System.out.println("Enter Tenth number  : ");
		numbers[9] = sc.nextInt();
		System.out.println("Printing Array without for loop ");
		System.out.println("First number is : "+numbers[0]);
		System.out.println("Second number is : "+numbers[1]);
		System.out.println("third number is : "+numbers[2]);
		System.out.println("Fourth number is : "+numbers[3]);
		System.out.println("Fifth number is : "+numbers[4]);
		System.out.println("Sixth number is : "+numbers[5]);
		System.out.println("Seventh number is : "+numbers[6]);
		System.out.println("Eighth number is : "+numbers[7]);
		System.out.println("Nineth number is : "+numbers[8]);
		System.out.println("Tenth number is : "+numbers[9]);
		System.out.println("Array with loop ");
		int looped[] = new int [10];
		System.out.println("Enter the number ");
		for (int i = 0; i < looped.length; i++) {
			System.out.println("Enter "+ (i+1) + " number : ");
			looped[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("Array printing using loop ");
		for (int i = 0; i < looped.length; i++) {
			System.out.println("The" + (i+1) + "th Number is : " +looped[i]);
		}
	}

}
