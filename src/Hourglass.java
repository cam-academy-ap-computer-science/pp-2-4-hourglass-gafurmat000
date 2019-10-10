/* 
 toAndBottom for (line 1 and 11) {
 	draw a bar
 	draw draw 10 quotes
 	draw final bar
 	}
 for (lines 2 through 5) {
 	add a <= 4 spaces
 	draw a backslash
 	draw <= 8 colon's
 	draw final forward slash
 	add <= 4 spaces
 	}
 for line 6 {
 	add 4 spaces
 	draw two bar's
 	add 4 more spaces
 	}
 for lines (7 through 10) {
 	have <= 4 spaces
 	draw forward slash
 	draw <= 8 colon's
 	}
 */

public class Hourglass {
	public static void main(String[] args) {
		System.out.print("|");
		for(int i = 1; i <= 10; i++) {
			System.out.print("\"");
	    }
		System.out.println("|");

		
		for(int i = 1; i <= 4; i++) { 
			System.out.print("\\");	
		}
		for(int j = 1; j <= (8 - 6) * 4; j ++) {
		System.out.print(":");
		}
/*		
		System.out.print("\\");
		for(int j = 1; j <= ((8 - 2) * i); j++) {
			System.out.print(":");
		}
*/
	}
}



