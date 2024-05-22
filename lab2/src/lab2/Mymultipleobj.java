package lab2;

public class Mymultipleobj {
	String name ;

	public static void main(String[] args) {
		Mymultipleobj firstobject = new Mymultipleobj();
		
		System.out.println("==My Old Name==");
		System.out.println(firstobject.name="Rabina");
		
		
		Mymultipleobj secondobject = new Mymultipleobj();
		System.out.println("==My School Name==");
		System.out.println(secondobject.name="Dikshya");
		
		
		
		Mymultipleobj thirdobject = new Mymultipleobj();
		System.out.println("==My New Name==");
		System.out.println(thirdobject.name="Sajina");
		
		

	}

}
