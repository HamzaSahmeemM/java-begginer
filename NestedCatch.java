package datas;

public class NestedCatch {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(" 1 "+e);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(" 2 "+e);
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(" 3 "+e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(" 3 "+e);
		}
	}

}
