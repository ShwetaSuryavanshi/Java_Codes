package java_programs;

public class Practice17_practiceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		cylinder cy=new cylinder();
//cy.vol_cir();
cy.volume();
	}

}
class circle{
	
	
		double r=12;
	double h=9;
	
	void vol_cir() {
	double	v=(2*3.14*r*h);
	System.out.println("Volume is"+v);
	}
}

class cylinder extends circle{
	void volume() {
	double p=( 3.14*r*r*h);
	System.out.println("Volume of cylinder is"+p);
	}
}