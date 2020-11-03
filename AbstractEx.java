package datas;
abstract class Bike{
	abstract void print() ;
		
	
}
public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike h1 = new Honda();
		h1.print();
	}

}
class Honda extends Bike{
	void print() {
		System.out.println("Abstraact Class ");
	}
}