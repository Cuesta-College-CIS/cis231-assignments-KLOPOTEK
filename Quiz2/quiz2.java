package Quiz2;
import java.util.Arrays;
import java.util.Random;

import java.util.Scanner;

public class quiz2{

public static int[] constructArray(Scanner scnr){
    int arraySize = scnr.nextInt();
    int [] begArray = new int[arraySize];
    Random randNum = new Random();
    for (int i = 0; i < arraySize; i++) {
        begArray[i] = randNum.nextInt(99) + 0;
        }
    return begArray;
}
public static void printArray(int[] pArray){
    System.out.println(Arrays.toString(pArray));
}
public static int findMoreEvens(int[] n1, int[] n2){
    int a1even, a2even;
    a1even=0;
    for(int i=0 ; i<n1.length ; i++){
        if(n1[i]%2==0)
        a1even++;
    }
    a2even=0;
    for(int i=0 ; i<n2.length ; i++){
        if(n2[i]%2==0)
        a2even++;
    }
    if(a1even>a2even)
        return 1;
    
    else 
        return 2;
    
}
public static int findGreatest(int[] n1, int[] n2){
    for(int i=0 ; i<n1.length-1 ; i++){
        if(n1[i] > n1[i+1]){
            int ph1 = n1[i];
            n1[i]=n1[i+1];
            n1[i+1]=ph1;
        }
    }
    for(int i=0 ; i<n2.length-1 ; i++){
        if(n2[i] > n2[i+1]){
            int ph2 = n2[i];
            n2[i]=n2[i+1];
            n2[i+1]=ph2;
        }
    }
    if(n1[n1.length-1]>n2[n2.length-1])
        return 1;
    else
        return 2;
}
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int [] array1, array2;
        array1 = constructArray(scnr);
        printArray(array1);
        array2 = constructArray(scnr);
        printArray(array2);
        int moreEvens = findMoreEvens(array1, array2);
        System.out.println("The array " + moreEvens + " has more even numbers");
        int greatest = findGreatest(array1, array2);
        if(moreEvens == 1)
            System.out.println("the array " + greatest + " has the greatest value " + array1[array1.length - 1]);
        else
            System.out.println("the array " + greatest + " has the greatest value " + array2[array2.length - 1]);

        scnr.close();


    }
}