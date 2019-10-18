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
	
