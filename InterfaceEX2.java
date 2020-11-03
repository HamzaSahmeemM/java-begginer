package datas;
interface Deal{
	void run();
}
public class InterfaceEX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dd ss= new dd();
		ss.run();
		ss.jumb();
	}

}
interface Dea extends Deal{
	void jumb();
}
class dd implements Dea{
	public void run() {
		System.out.println("Hello this is good");
	}
	public void jumb() {
		System.out.println("Not good");
	}
}
