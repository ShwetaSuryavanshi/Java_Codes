package java_programs;

public class Practice21_Interfaaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  hippoCycle h=new hippoCycle();
  h.applybrake();
 h. increment(2);

  h.speedup();
  h. decrement(2);
	}
 
}
interface cycle{
	
	public	void applybrake();
		void speedup();
	
	
}
interface s{
	void increment(int i);
	void decrement(int d);
	
}
 class hippoCycle implements cycle,s{
	 int speed=10;
	public  void applybrake() {
		 System.out.println("Apply the brake");
		 
	 }
	public void increment(int i) {
	int	p=speed-i;
	System.out.println("Apply the brake: "+p);
	}
	public void speedup() {
		 System.out.println(" speed up");
	 }
	public void decrement(int i) {
		int	p=speed+i;
		System.out.println("speed up: "+p);
		}
 }