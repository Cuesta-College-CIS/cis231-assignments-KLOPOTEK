package Labs_515_520;
/*
 *For this program, adjust the values by dividing all values by
 *the largest value. The input begins with an integer indicating 
 *the number of floating-point values that follow. Assume that the 
 *list will always contain fewer than 20 floating-point values.
*/
import java.util.Scanner;

public class Lab516 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int NUM_ELEMENTS=20;
        float[] myArray = new float[NUM_ELEMENTS];
        int numElem;
        float maxValue;

        numElem = scnr.nextInt();
        myArray[0]=scnr.nextFloat();
        maxValue=myArray[0];

        for(int i=1; i<numElem; ++i){
            myArray[i]=scnr.nextFloat();
        }
        for(int i=1; i<numElem; ++i){
            if(myArray[i]>maxValue){
                maxValue=myArray[i];
            }
        }
        for(int i=0; i<numElem; ++i){
            myArray[i]=myArray[i]/maxValue;
            System.out.printf("%.2f ",myArray[i]);
        }
        System.out.print("\n");
        scnr.close();
    }
}

