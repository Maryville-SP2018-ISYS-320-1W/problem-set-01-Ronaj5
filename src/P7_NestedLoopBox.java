/*
  	ISYS 320
	Name(s): Rona Davis	
	Date: March 28, 2018
  	
	This was included already so I don't understand what needs to be done.
*/

/* 4. Your pseudocode algorithm here

for( 6 lines )
	for( 6 stars per line)
		print("*")
		print new line

*/
public class P7_NestedLoopBox {

	
	public static void main(String[] args) {
		for(int lines = 6; lines >= 1; lines--) {
			for(int stars = 6; stars >= 1; stars--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
