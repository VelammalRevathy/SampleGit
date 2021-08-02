package org.phone;

public class Phone {
	public void phoneInfo(long a, String b) {
		System.out.println("The Phone Number is "+ a +"Name is "+ b);
	}
	public void phoneInfo(String c, long d) {
		System.out.println("The Name is "+ c +"Phone Number is "+d);

	}
	public static void main(String[] args) {
		Phone p = new Phone();
		p.phoneInfo(9876578765l, "Vinoth");
		p.phoneInfo("Vinith", 7876898767l);
		
		
		
		
		
	}
		

}
		
		
		

	

