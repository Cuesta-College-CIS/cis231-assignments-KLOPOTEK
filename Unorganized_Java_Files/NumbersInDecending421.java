package Unorganized_Java_Files;
import java.util.Scanner;
public class NumbersInDecending421{
   public static void main(String[] args){
      int n;  // n : user input
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt(); 
      sc.close();
      for (; n >=0; n--) {
        System.out.print(n+" ");
      }
  }
}
