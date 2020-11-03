package datas;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a  ;
			a = 10 / 0 ;
		}
		catch (Exception e) {
			// TODO: handle exception
			try {
				int a[] = new int[2];
				a[10] = 0;
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2);
			}
			System.out.println(e);
		}
	}

}
