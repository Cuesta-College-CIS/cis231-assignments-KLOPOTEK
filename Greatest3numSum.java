import java.util.Scanner;
import java.util.Random;

public class Greatest3numSum{
    //this program looks through the elements in an array and
    //summs three consecutive elements and finds the three with the 
    //biggest sum.
    public static int[] constructArray(int elements){//constructs the array of numbers
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

    public static int[] findSum(int[] array){
        int maxSum=0, testSum=0;
        int[] sumElements = new int[3];
        if(array.length>3){//check if there is more than three
            for(int i=0; i<array.length-2; i++){//there is a minus 2 becasue we check i+2 in the loop
                testSum = array[i] + array[i+1] + array[i+2];
                if(testSum>maxSum){
                    maxSum = testSum;
                    sumElements[0] = array[i];
                    sumElements[1] = array[i+1];
                    sumElements[2] = array[i+2];
                }
            }
        }else{
            sumElements = array;
        }   
        return sumElements;
    }

    public static void printSum(int[] array){
        int sum;
        sum = array[0] +array[1] +array[2];
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numElem;
        int[] numbers;
        int[] numbersSum;

        numElem = scnr.nextInt();
        numbers = constructArray(numElem);
        printArray(numbers);
        numbersSum = findSum(numbers);
        printArray(numbersSum);
        printSum(numbersSum);

        scnr.close();
    }

}