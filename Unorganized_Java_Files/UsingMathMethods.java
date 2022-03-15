package Unorganized_Java_Files;
import java.util.Scanner;

public class UsingMathMethods {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      double x;
      double y;
      double z;
      double ans1;
      double ans2;
      double ans3;
      double ans4;
      x = in.nextDouble();
      y = in.nextDouble();
      z = in.nextDouble();
      ans1 = Math.pow(x, z);
      ans2 = Math.pow(x,Math.pow(y,z));
      ans3 = Math.abs(y);
      ans4 = Math.sqrt(Math.pow((x*y),z));
      System.out.printf("%f %f %f %f\n",ans1, ans2, ans3, ans4);
      in.close();
   }
}
