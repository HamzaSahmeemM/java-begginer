package datas;

public class Exce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		try {
			int a ;
			a = 10 /0 ;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.getMessage();
		}
		finally {
			System.out.println("finally block");
		}
	}

}
