package datas;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		try {
			a[10] = 10;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
