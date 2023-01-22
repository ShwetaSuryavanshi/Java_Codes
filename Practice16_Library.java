package java_programs;



public class Practice16_Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	
	library l=new library();
	
l.addbooks("Algorithm");
l.addbooks("physice");
l.addbooks("chemistry");
l.addbooks("maths");
l.showbooks();
l.issubooks("Algorithm");
l.showbooks();
}
}

class library{
	String[] array= new String[10];
	//Scanner s=new Scanner(System.in);
	int n=0;
	 
	public void addbooks(String s) {
		
			array[n]=s;
			n++;
			System.out.println("Book added");
			
		
		
	
	}
	
		
	
	public void showbooks() {
		for(String book:array) {
			if(book==null)
				continue;
			
	System.out.println("Available books are:"+book);}
	

		
	}
	public void issubooks(String p) {
		for(int i=0;i<this.array.length;i++) {
		if(array[i].equals(p)) {
			
			System.out.println("Book issued");
			this.array[i]=null;
			return;
		}
		
		}
		
	}
}