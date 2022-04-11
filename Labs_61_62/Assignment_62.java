package Labs_61_62;

import java.util.Scanner;

public class Assignment_62 {
       
    public static int fibonacci(int n) {
        if(n<0){//if input is negative return "-1"
            return -1;
        }
        else{
        int[] fib_array= new int[n+1];//add one to the length because the first element is zero
           fib_array[0]=0;//if input is 0 skip the if statement below
           if(n>0){//if input is greater than 0, calculate and fill array with "n" elements
                fib_array[1]=1;//cant calculate, so i manually enter this
                for(int i=2; i<=n; i++){
                    fib_array[i]=fib_array[i-1]+fib_array[i-2];
                }
            }    
            return fib_array[n];//return the fibbonacci value at "n"
        }
    }
   
   
   public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
     int startNum;
     startNum = scnr.nextInt();
     scnr.close();
     System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
     }
   }
  