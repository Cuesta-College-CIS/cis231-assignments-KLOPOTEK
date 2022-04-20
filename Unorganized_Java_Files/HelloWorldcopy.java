package Unorganized_Java_Files;
/**
 * HelloWorld
 */
public class HelloWorldcopy {

    public static void main (String[] args) {
        int i = 1;
        
        while (i <= 3) {
           int j = 1;
           while (j <= i) {
              System.out.print("x");
              ++j;
           }
           System.out.println();
           ++i;
        }
    }
}