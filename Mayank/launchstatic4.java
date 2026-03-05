package Mayank;

class AlieN{
	
	static {
		
		System.out.println("Sb1");
		}
	static {
		
		System.out.println("Sb2");
		}
	{
		
		System.out.println("Nsb1");
	}
	   void disp(){
		
		System.out.println("Nsb2");
		}
	
	}

public class launchstatic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           AlieN a = new AlieN();
          a.disp();
	}

}
