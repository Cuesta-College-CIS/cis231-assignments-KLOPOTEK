package Labs_515_520;
/*
 *  Write a program that first gets a list of integers from input.
 *  The input begins with an integer indicating the number of integers
 *  that follow. Then, get the last value from the input, which indicates
 *  a threshold. Output all integers less than or equal to that last
 *  threshold value. Assume that the list will always contain fewer 
 *  than 20 integers.
 */
import java.util.Scanner; 

public class Lab515 {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];
      int count;// List of integers from input

      count=0;
      userValues[0]=scnr.nextInt();
      for(int i=1; i<=userValues[0]+1; ++i){
         userValues[i]=scnr.nextInt();
         ++count;
      }
      scnr.close();
      for(int i=1; i<=userValues[0]; ++i){
         if(userValues[i]<=userValues[count]){
            System.out.print(userValues[i]+",");
         }
         
      }   
      System.out.print("\n"); 
      scnr.close();
   }
}