package datas;

public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Det dt1 = new Det(10, "sham" );
	dt1.print();
	Det dt2 = new Det(11, "eem" );
	dt2.print();
	Det dt3 = new Det(12, "hamz" );
	dt3.print();
	}

}
class Det{
	int roll;
	String name ;
	static String clg = "abc";
	
	public Det(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	void print() {
		System.out.println(roll);
		System.out.println(name);
		System.out.println(clg);
	}
}
