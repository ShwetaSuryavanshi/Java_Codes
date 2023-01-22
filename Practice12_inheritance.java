package java_programs;

public class Practice12_inheritance {

	public static void main(String[] args) {
		// -----------Inheritance-----------
	
		base b=new base();
		b.setx(2);
		System.out.println(b.getx()); //----------print x from base class

		derived d=new derived();
		d.sety(4);
		System.out.println(d.gety()); //--------print y from derived class
		d.setx(6);
		System.out.println(d.getx()); //---------print x from derived class because base class properties are inherited in derived class
	}

}
class base{                                   //---------base class
	int x;
	void setx(int p) {
		x=p;
	}
	int getx() {
		return x;
	}
	
	
}
class derived extends base{                 //--------derived class
	
	int y;
	void sety(int v) {
		y=v;
	}
	int gety() {
		return y;
	}
	
	
}