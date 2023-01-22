package java_programs;

public class Practice13_InheritanceWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	base1 b=new base1(4);
		//derived1 d=new derived1(2,3,12);
		
ChildOfDerived c=new ChildOfDerived(5,6,7,8);
//ChildOfDerived c=new ChildOfDerived();
	}

}
class base1{
	
	base1(){
		System.out.println("I am base constructor");
	}
	base1(int a){
		System.out.println("I am overloaded base constructor: "+a);
	}
	
}
class derived1 extends base1{
	
	derived1(){
	//	super(4);
		System.out.println("I am derived constructor");
	}
	
 derived1(int a, int b,int c){
	 super(a);
	 System.out.println("I am overloaded derived constructor"+b);
	 System.out.println("I am overloaded derived constructor"+c);
 }
}

class  ChildOfDerived extends derived1{
	
	ChildOfDerived(){
		
		System.out.println("I am child of derived constructor");
	}
ChildOfDerived(int a,int b, int c,int d){
		super(a,b,c);
		System.out.println("I am overloaded child of derived constructor"+ d);
	}
	
}
