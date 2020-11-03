package datas;

public class Inheritance {

public static void main(String[] args) {
	Demo d1 = new Demo();
    d1.print();	
}
}
class Dm{
	int a =10;
	String name = "abc";
	double ant = 110.25;
}
class Demo extends Dm{
	void print() {
		System.out.println(a);
		System.out.println(name);
		System.out.println(ant);
	}
}

