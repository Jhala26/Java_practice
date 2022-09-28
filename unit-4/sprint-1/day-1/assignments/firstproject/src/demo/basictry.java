package demo;

public class basictry {

	public static void main(String[] args) {

		
		
//		  double a = 20.05;
//		  float b = (float)a;
//		  int c = (int)b;
//		  
//		  System.out.println(a);
//		  System.out.println(b);
//		  System.out.println(c);
		
		
		String city = "Bangalore";
		
		switch(city) {
		
		case "Mumbai" : {
			System.out.println("Financial city");
			break;
		}
		case "Kolkata" :{
			System.out.println("City of Joy");
			break;
		}
		case "Delhi" :{
			System.out.println("Capital of the country");
			break;
		}
		case "Bangalore":{
			System.out.println("Cyber City");
			break;
		}
		default:{
			System.out.println("May be Other Indian City");
		}
		}
		 
		 

	}
}
