package Mayank;


//class Demo{
//	
//	static int a,b,c;
//	
//	static {
//		System.out.println("Static Init Block");
//		 a = 10;
//		 b = 20;
//		 c = 30;
//		 }
//	
//	static void disp() {
//		System.out.println("a "+a);
//		System.out.println("b "+b);
//		System.out.println("c "+c);
//		}
//	}

public class launchstatic {
	
	static int a;
	
	static {
		a =10;
		System.out.println("a: "+a);
		System.err.println("Static Block");
		
		
		
		
	}
	
	

	public static void main(String[] args) {

		
           System.out.println("Main method");
		// TODO Auto-generated method stub

	}

}
