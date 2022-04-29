package Labs_71_74;
import java.util.Scanner;

public class Assignment_7_4 {

   public static void main(String [] args){
      Scanner scnr = new Scanner(System.in);
      int inputNum = scnr.nextInt();
      Number yourNum = new Number(inputNum);
      System.out.print(yourNum.toString());
      scnr.close();
   }
}