package java_programs;

public class Practice20_AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	parent1 p=new parent1(); //cannot create object of this parent class  due to  declaring it as abstract
		child1 c1=new child1();
	
		c1.greet_af();
	c1.get();	
	//child2 c2= new child2();  
	//c2.th(); // cannot create object of this child class  due to  declaring it as abstract
	}

	parent1 p=new child1(); //Dynamic method dispatch
	
	
	
}

abstract class parent1{
	void get() {
		System.out.println("Hey hjg");
	}
	abstract public void greet_af();
	abstract public void greet_mor();
			
	
}

class child1 extends parent1{
	public void greet_af() {
		System.out.println("Hey Goodafternoon");
	}
	
	public void greet_mor() {
		System.out.println("Hey Goodmorning");
	}
	
}
abstract class child2 extends parent1{ //if child class doesnt contain same methods of abstract parent class then make child class abstract
	public void th() {
		System.out.println("Hey Good night");
	}
	
}