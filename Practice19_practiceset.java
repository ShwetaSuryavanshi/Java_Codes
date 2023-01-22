package java_programs;

public class Practice19_practiceset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
rectangle1 r=new rectangle1();
cuboid1 c=new cuboid1();
r.set_area(2,3);
c.set_cu(2,3,4);
System.out.println("Area of rec is: "+r.get_area());
System.out.println("Area of rec is: "+c.get_area()); // use constructor to take l and b from child class
System.out.println("Area of cub is: "+c.get_cu());

	}

}
 class rectangle1{
	 public int area;
	 
	 void set_area(int l,int b) {
		 area=l*b;
		 
	 }
	 int get_area() {
		return area;
		 
	 }
	 
	 
	 
 }
class cuboid1 extends rectangle1{
	int volume;
	void set_cu(int l,int b,int h) {
		 volume=l*b*h;
		 
	 }
	 int get_cu() {
		return volume;
		 
	 }
	 
 }