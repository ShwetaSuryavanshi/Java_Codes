package java_programs;

public class Practice25_practiceSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
human h=new human();
h.jump();
h.bite();
h.eat();
h.sleep();

basicAnimal a=new human(); // polymorphism in interface
System.out.printf("\n");
a.eat();
//a.speak(); --> error

monkey m=new human(); 
m.jump();
//m.eat(); --> error
	}

}

class monkey{
	void jump() {
		System.out.println("Jump....");
	}
	void bite() {
		System.out.println("bite....");
	}
}
interface basicAnimal{
	void eat();
	void sleep();
}
class human extends monkey implements basicAnimal{
	public void eat() {
		System.out.println("eat....");
	}
	public void sleep() {
		System.out.println("sleep....");
	}
	 void speak() {
		System.out.println("speak....");
	}

}