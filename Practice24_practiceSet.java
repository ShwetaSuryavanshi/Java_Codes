package java_programs;

public class Practice24_practiceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FountainPen p=new FountainPen();
p.write();
p.refill();
p.changeNib();
	}

}
abstract class  pen{
	abstract void write();
	 abstract void refill();
}

class FountainPen extends pen{
	void write() {
		System.out.println("write....");
	}
	void refill() {
		System.out.println("refill....");
	}
		void changeNib() {
			System.out.println("change Nib....");
		}
	}
