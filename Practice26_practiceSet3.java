package java_programs;

public class Practice26_practiceSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
telephone t=new SmartTelephone(); // Polymorphism
t.with();
t.lift();
t.disconnect();
//t.call(); ----->error

SmartTelephone s=new SmartTelephone();
s.with();
s.call();
	}

}
 abstract class telephone{
	abstract void with();
	abstract void lift();
	abstract void disconnect();
	void d(){
		System.out.println("jhfkjdf....");
	}
 }
 class SmartTelephone extends telephone{
	public void with() {
		System.out.println("with....");
	}
	public void lift() {
		System.out.println("lift....");
	}
	public void disconnect() {
		System.out.println("disconnect....");
	}
	void call(){
		System.out.println("call");
	}
 }