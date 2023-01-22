package java_programs;

public class Practice14_MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a=new A();
         a.meth1();
         B b=new B();
         b.meth1();
         
	}

}
class A{
	int a=5;
	public void meth1() {
		System.out.println("I am method 1 of class A");
		;
	}
	
}
class B extends A{
	@Override
	public void meth1() {
		System.out.println("I am method 1 of class B");
	}
	public void meth2() {
		System.out.println("I am method 2 of class B");
	}
}