package Mayank;

class Student
{
	int id;
	String name;
	String city;
	
    static int count;
    
    {
    	count++;
    }
	
	Student(){
		
		System.out.println("Zero parameterized constructor");
//		count++;         to avoid count++ in every constructor we have assigned count++ in java initialization block
		
		}

	public Student(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
		
//		count++;
		
		
		
	}
	}

public class launchstatic3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		Student st1 = new Student(4,"Rohit","Bengaluru");
//		System.out.println("no. of objects created: " +st1.count);
		System.out.println("no. of objects created: " +Student.count);  // st is not used because static variable(count) can be accessed using class name only i.e, no need of object creation for accessing static variables
		
		Student st2 = new Student(5,"Rohan","Mumbai");
//		System.out.println("no. of objects created: " +st2.count);
		System.out.println("no. of objects created: " +Student.count);
				
		Student st3 = new Student(6,"Rachit","Delhi");
//		System.out.println("no. of objects created: " +st3.count);
		System.out.println("no. of objects created: " +Student.count);
		 
		
		
		}
}
