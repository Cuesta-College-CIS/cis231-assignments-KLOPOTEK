import java.util.Scanner;
import java.util.Random;

public class FindMedian {
//This program finds the median of array elements, with an array size n.
//The value n is generatied from user input. 
//The array is also filled with randomly generated numbers.
public static int[] constructArray(int elements){
    int arraySize = elements;
    int [] begArray = new int[arraySize];
    Random randNum = new Random();
    for (int i = 0; i < arraySize; i++) {
        begArray[i] = randNum.nextInt(99) + 0;
        }
    return begArray;
}

public static void printArray(int[]array){
    for (int element: array) {
        System.out.print(element+" ");    
    }
    System.out.println("");
}

public static int[] orderedArray(int[]array){
    int holder;
    for(int j=0; j<array.length-1; j++){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>array[i+1]){
                holder=array[i+1];          //move the value at i+1 so that i can be moved to the next index
                array[i+1]=array[i];        //move i to the next index
                array[i]=holder;            //move the value at i+1 to the previous index
            }
        }    
    }
    return array;
}
public static int findMedian(int[] array){
    int medianValue;
    medianValue = array[array.length/2];
    return medianValue;
}
public static void printMedian(int value){
    System.out.println(value+"\n");
}


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElem;
        int median;
        int[] numbers;

        numElem = scnr.nextInt();
        numbers = constructArray(numElem);
        printArray(numbers);
        numbers = orderedArray(numbers);
        printArray(numbers);
        median = findMedian(numbers);
        printMedian(median);

        scnr.close();
    }
    
}
