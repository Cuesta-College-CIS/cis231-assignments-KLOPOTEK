package Unorganized_Java_Files;
import java.util.Scanner; 

public class MoreLoops4_25 {
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
      int cnt=0;
		  char max_char;
		  max_char = ' ';
      String inputString;
      int i=0;
      inputString = scnr.nextLine();
      inputString = inputString.toLowerCase();
		while (i < inputString.length()) {
			if (Character.isLetter(inputString.charAt(i))) {
				if (max_char < inputString.charAt(i)){
					max_char = inputString.charAt(i);
          }
					cnt++;
				}
			i++;
      }
      scnr.close();
      System.out.printf("%d\t%c\n", cnt, Character.toUpperCase(max_char));
   }
}

