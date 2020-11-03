package datas;
import java.util.*;
public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		 int num , number, temp, total = 0;
		 	num = sc.nextInt();
		 	sc.close();
	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");	}
	}


