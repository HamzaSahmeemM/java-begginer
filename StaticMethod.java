package datas;

public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st = new student();
		System.out.println(st.a);
		System.out.println(student.name);
		student.print();
		System.out.println(student.name);
		System.out.println(">>>>>>>>>>>>>>>>>");
		st.print();
		student st2 = new student();
		st2.print();
	}
}

class student{
	int a = 10 ;
	static String name = "abc" ;
	static void print() {
		name = "xyz" ;
		System.out.println(name);
	}
}