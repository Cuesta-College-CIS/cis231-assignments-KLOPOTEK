package Unorganized_Java_Files;
import java.util.Scanner;
import java.lang.Math;
public class PowerNumbers422{
   public static void main(String[] args){
      int n;  // n : user input
      Scanner sc = new Scanner(System.in); 
         n = sc.nextInt();
         int p= sc.nextInt();
         int z;
         for (int x=0; x<=p; x++) {
           z=(int)Math.pow(n,x);
           System.out.print(z+" ");
         }
         sc.close();
      }
      }
   
   

