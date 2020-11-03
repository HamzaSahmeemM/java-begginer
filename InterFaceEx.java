package datas;
interface Bike1{
	void run();
	
}
public class InterFaceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike1 b = new Hond();
		b.run();
	}

}
class Hond implements Bike1{
	public void run() {
		System.out.println("Honda is is good bike ");
	}
}
