package lab2;

public class construct {
	String name;
	String address;
	private char[] n;
	private char[] m;
	
	
	construct(){
		System.out.println("Constructor call");
		name = " Rabina ";
		address = "Sanepa";
		
	}
	
	void value(String n, String m)//parameterized constructor
	{
		name= n;
		address=m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		construct obj = new construct();
		System.out.println("The name is " + obj.name);
		System.out.println(obj.address);
		
		
		

	}
	public static void main1(String[] args) {
		construct data = new construct();
		System.out.println(data.n);
		System.out.println(data.m);
	}

}
