package Labs_515_520;

// Your program should delete one element from the unsorted array.
// The first part of this work will be finding the target value. 
// Once you find the value in the array, you should delete it and 
// then shift left all rest of the elements after the deleted element 
// in order not to leave it as a blank.

import java.util.Scanner;

public class Lab520 {
    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int idx, length, target, i;
		int[] numbers = { 45, 20, 30, 35, 10 };

		target = scnr.nextInt();
		length = numbers.length;
		
		for(idx=0; idx<length; ++idx){
            if(target==numbers[idx]){
                for(i=idx;i<length-1;++i){
                    numbers[i]=numbers[i+1];
                }
                length=length-1;
            }
        }

		for (i = 0; i < length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();

		scnr.close();
	}

}


