package Unorganized_Java_Files;
import java.util.Scanner;
public class NumbersInSequence420{
   public static void main(String[] args){
      int n;  // n : user input
      int x=0;
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt(); 
      while(x<=n){
         System.out.print(x+" ");
         x++;
      }
      sc.close();
   }
}