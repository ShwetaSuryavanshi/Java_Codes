package java_programs;

public class Practice15_DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Phone p=new Smartphone(); //allowed
// Smartphone p=new Phone(); //not allowed
 p.on();
 //p.music(); // it gives error because its not defined in phone class
 p.ring();
	}

}
class Phone{
	public void ring(){
		System.out.println("Ring.....");
	}
	public void on(){
		System.out.println("Phone gets on....");
	}
	
}
class Smartphone extends Phone{
	public void music() {
		System.out.println("play the Music.....");
	}
	@Override
	public void on() {
		System.out.println("Smartphone gets on");
	}
}