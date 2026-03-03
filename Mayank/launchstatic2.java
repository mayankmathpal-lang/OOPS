package Mayank;

class Demo2{
	static int a,b,c;
	int x,y,z;

	
	static {
		System.out.println("Static init block");
		a=10;
		b=20;
		c=30;
       }
	 
	static void disp() {
		System.out.println("a: " +a);
		System.out.println("b:" +b);
		System.out.println("c:" +c);
		}
	{
		x=44;
		y=45;
		z=50;
		System.out.println("Java initialization block");
		
	}
	
	Demo2(){
		System.out.println("Constructor");
			}
	
	void disp2() {
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("c "+c);
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("z "+z);
		
	}
	}

public class launchstatic2 {
	public static void main(String[] args) {
		Demo2.disp();
		
		System.out.println("*********************************");
		
		Demo2 d2=new Demo2();
		d2.disp2();
	}

}
