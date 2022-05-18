package com.masai;

public class Vovel {
	
	public void check(String a) {
		if(a=="a" | a=="o" | a=="u" | a=="i" | a=="e") {
			System.out.println("Vovel");
		}
		else if(a=="err")
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vovel d1 = new Vovel();
		String  a = "a";
		String  b = "c";
		String  c = "err";
		d1.check(  a);
		d1.check(b);
		d1.check(c);
		

	}

}
