
package Mayank;


class Finishers{
  
  private int id;
  private String name;
  private String city;
  public Finishers() {
	super();
	// TODO Auto-generated constructor stub
  }
  
  
  
  public Finishers(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}



  public int getId() {
	  return id;
  }
  public void setId(int id) {
	  this.id = id;
  }
  public String getName() {
	  return name;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public String getCity() {
	  return city;
  }
  public void setCity(String city) {
	  this.city = city;
  }
  
  
}
public class launchconstructor {

/**
 * @param args
 */

/**
 * @param args
 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	Finishers f1 = new Finishers();
	f1.setId(3);
	f1.setName("Mayank");
	f1.setCity("Mumbai");

	System.out.println(f1.getId());
	System.out.println(f1.getName());
	System.out.println(f1.getCity());
	
	System.out.println("***************");
	
	
	Finishers f2 = new Finishers(4, "Akshat", "Delhi");
	System.out.println(f2.getId());
	System.out.println(f2.getName());
	System.out.println(f2.getCity());
	
}

}