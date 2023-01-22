package java_programs;

public class Practice22_InheritanceInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myclass m=new Myclass();
m.meth1();
m.meth2();
m.meth3();
m.meth4();
	}

}
 interface int1{
	 void meth1();
	 void meth2();
 }
 
 interface int2 extends int1{
	 void meth3();
	 void meth4();
 }
 class Myclass implements int2{
	public void meth3() {
		 System.out.println("Method 3");
	 }
	public void meth2() {
		 System.out.println("Method 2");
	 }
	public void meth1() {
		 System.out.println("Method 1");
	 }
	public void meth4() {
		 System.out.println("Method 4");
	 }
	
 }