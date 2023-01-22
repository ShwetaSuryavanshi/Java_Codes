package java_programs;

public class Practice23_PolymorphismInInterfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
mycamera c= new SmartPhone1(); //----> this is a smart phone but use it as a camera
//c.getnetworks(); -----> not allowed
c.takesnap();
c.recordvideo();
c.recordin4k();

SmartPhone1 s= new SmartPhone1(); 
s.meth();
s.getnetworks();
s.connectionToNetwork("sghhggjh");
s.call(5375);
	}

}

interface mycamera{
	void takesnap();
	void recordvideo();
	private void greet() {
	System.out.println("Good Morning");	
	}
	default void recordin4k() {
		greet();
		System.out.println("4k.....");	
	}
}

interface wifi{
	String[] getnetworks();
	void connectionToNetwork(String n);
}

class myPhone{
	void  call(int i) {
		System.out.println("Calling...."+i);
	}
	void pickcall() {
		System.out.println("Pick the call....");
	}
}

class SmartPhone1 extends myPhone implements mycamera,wifi{
	public void takesnap() {
		System.out.println("Take photo...");
	}
		public void recordvideo() {
			System.out.println("Take video...");
		}
			public String[] getnetworks() {
				System.out.println("Getting the list of networks:");
				String[] networklist= {"name1","name2","name3","name4"};
			return networklist;	
			}
			public void connectionToNetwork(String n) {
				System.out.println("connecting network..."+n);
			}
			void meth() {
				System.out.println("Method 1...");
			}
	}
