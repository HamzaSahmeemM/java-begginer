package datas;

public class MethodeOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deno dn = new Deno();
	}

}
class Deno{
	void sum(int a , int b) {
		int c = a, d =b  ;
		int e =c+d;
		System.out.println(e);
	}
	void sum(int a,int b ,int c) {
		int one = a ,two = b ,three = c;
		System.out.println(one+two+three);
	}
	void sum() {
		System.out.println("Good");
	}
	void sum(double a ,double b) {
		double c,d;
		c=a;
		d=b;
		double e= c+d;
		System.out.println(e);
	}
}