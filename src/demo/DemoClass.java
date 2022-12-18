package demo;

public class DemoClass {
	
	String name;
	String email;
	int age;
	
	
	public static void main(String[] args) {
		DemoClass demo = new DemoClass();
		demo.name = "Marshal";
		System.out.println(demo.name);
		
		demo.email = "ankit@gmail.com";
		demo.age = 24;
		
		System.out.println(demo.email +" "+demo.age);
		
		// 
		System.out.println("Thanks for adding the details ...");
		System.out.println();
		System.out.println("Hey ");
		
		// 
		System.out.println("New Git develop bramch added");
		System.out.println("Master branch is safe now");
	}

}
