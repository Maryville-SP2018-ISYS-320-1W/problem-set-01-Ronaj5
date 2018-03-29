/*
  	ISYS 320
  	Name(s): Rona Davis
  	Date: March 28, 2018
  	
  	This was included already so I don't understand what needs to be done.
*/

public class P4_Position {

	public static void main(String[] args) {

		double s0;
		double v0;
		double a; 
		double t; 
		double t2;
		double s;
		
		s0 = 15;
		v0 = 18;
		t = 45;
		a = 5;
		t2 = t * t;
		s = s0 + v0 * t + (.5 * (a * t2));
		
		System.out.print("s = ");
		System.out.print(s);
	}

}
