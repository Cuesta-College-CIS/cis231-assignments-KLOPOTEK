package Labs_61_62;

import java.util.Scanner;
//swaps array elements at indices 0 and 1, and swaps array elements at indices 2 and 3.
public class Assignment_61 {
     //method that swaps the values
    public static void swapValues(int[] values){
        for(int i=0;i<3;i+=2){
            int x=values[i];
            values[i]=values[i+1];
            values[i+1]=x;
        }
    }
   
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] userValues = new int[4];
        for(int i=0;i<4;i++){
            userValues[i]=scnr.nextInt();
        }
        scnr.close();
        swapValues(userValues);
        for(int i=0;i<3;i++){
            System.out.print(userValues[i]+" ");
            if(i==2){
               System.out.print(userValues[i+1]);
            }
        }   
        System.out.print("\n");
         
   }
}


