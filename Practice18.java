package java_programs;

public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

cuboid c=new cuboid(2,3,4); //invokesmv parameterized constructor
//cuboid c=new cuboid(); // invokes non parameterized constructor


	}

}
class rectangle{
	
	rectangle(){
	 
	 System.out.println("Non parameterized rectangle");
	 
	}
	 
	 rectangle(int length ,int breadth){
		 
		 System.out.println("Area of rect2 is:"+length*breadth);
		 
		}
}
class cuboid extends rectangle{
	//int height=8;
	cuboid(){
		
		System.out.println("Non parameterized cuboid");	
	}
	cuboid(int length,int breadth,int height){
		super(length,breadth);
		System.out.println("Volume of cuboid1:"+(length*breadth*height));	
	}
	/*void volume() {
		
		System.out.println("Volume of cuboid2"+(length*breadth*height));
	}*/
}