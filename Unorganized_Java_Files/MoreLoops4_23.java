package Unorganized_Java_Files;
import java.util.Scanner;

public class MoreLoops4_23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
		int Max=0;
		int Min=0;
        int userInput;
        int sum=0;
        int total=0;
        boolean firstLoop=true;
        int numbersRan=0;
        float average=0;

		 while (true) {
		 userInput = sc.nextInt();
		 if ( userInput<0){
		 break;
         }
         if (firstLoop==true){
             Max=userInput;
             Min=userInput;
             firstLoop=false;
         }
		 if (userInput > Max) {
			Max = userInput;
		 }
         if (userInput < Min) {
			Min = userInput;
         }
         total+=userInput;
         numbersRan++;
        }
        sum=total-Max-Min;
        if(sum<0){
           sum=0;
        }
        float denominator=numbersRan-2;
        if(denominator<0){
           denominator=0;
        }
        average= sum/(denominator);
     if((denominator==0) && (sum==0)){
        average=0/1;
     }
      sc.close();
		System.out.printf("%d %.2f\n", sum, average);
	}
}