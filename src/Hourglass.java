/***** 
 * Grading Comments:   23/25 pts
 * Very Good Job.  I like the way you did your pseudocode 
 * and comments in particular.  You also made it extra-hard
 * on yourself by doing spaces AFTER the '/' on the other
 * side of the hourglass which wasn't necessary, but
 * nice work anyway.
 * 
 * Correct Output 10/10
 * Proper Use of Static Methods 3/3
 * Proper Use of for loops 3/3
 * Pseudocode 3/3
 * Comments 2/2
 * Consistent Layout and Style 2/2 -  Make sure your
 *   indentation lines up correctly, though - 
 * Proper Use of Class Constant 0/2 - You didn't use a class
 * constant at all.  
 * Resizing extra credit: 0/2
 */ 
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
		drawLine();
		drawTop();
		middle();
		drawBottom(); 
		drawLine();
	}
	//creates both the top and the bottom of the hour glass/ moves onto next part
		public static void drawLine() {
		System.out.print("|");
		for(int i = 1; i <= 10; i++) {
			System.out.print("\"");
			
	    }
		System.out.println("|"); 
		}
		//creates the top of the hour glass/ moves onto next part
		 public static void drawTop() {
			 for (int line = 1; line <= 4; line++) {
				 for(int space = 1; space <= 1 * line + 0; space++) {
					 System.out.print(" ");
				 }
				 System.out.print("\\");
				 for (int i = 1; i <= (10 - 2 * line); i++) {
					 System.out.print(":");
				 }
				 System.out.print("/");
				 for (int spaces2 = 1; spaces2 <= (line - 2); spaces2++) {
					 System.out.print(" ");
			 }
				 System.out.println(" ");
			 }
			 }
		
		 //creates the middle part of the hour glass in which the sand  goes through/ moves onto next part
		 public static void middle() {
			for(int k = 1; k <= 5; k++) {
			System.out.print(" ");
			}
			System.out.println("||");
		}
		 //creates the bottom of the hour glass/ and moves onto next part
		public static void drawBottom() {
			for (int line = 1; line <= 4; line++) {
				 System.out.print(" ");
				 for(int space = 1; space <= -1 * line + 4; space++) {
					 System.out.print(" ");
				 }
				 System.out.print("/");
				 for (int i = 1; i <= 2 * (line); i++) {
					 System.out.print(":");
				 }
				 System.out.print("\\");
				 for (int spaces2 = 1; spaces2 <= line ; spaces2++) {
					 System.out.print(" ");
			 }
				 System.out.println(" ");
			 }
			 }
}
	
