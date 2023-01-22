package java_programs;

public class Practice27_practiceSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
tv t=new tv();
t.onTv();
t.offTv();

	}

}

interface TVremote{
	void onTv();
	void offTv();
	
}
interface smartTv extends TVremote{
	void changeChannell();
	
	void volumeInc();
}

class tv implements smartTv{
	public void onTv() {
		System.out.println("Tv on....");
		
	}
	public void offTv() {
		System.out.println("Tv off....");
		
	}
	public void changeChannell() {
		System.out.println("change Tv channel....");
		
	}
	public void volumeInc() {
		System.out.println("increase vol of Tv channel....");
		
	}
	
}