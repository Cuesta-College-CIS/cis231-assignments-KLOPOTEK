package Labs_515_520;

// The program adds one value to the sorted integer array. The array 
// has to keep the sorted order after insertion.int length = 5; 
// the number of actual value elements.
// int [] number = {5, 20, 30, 35, 50, 0, 0, 0, 0, 0};
// the actual size of array is 10, but we use only 5 elements currently. 
// The all 0’ values means the unused space where it will be 
// allocated by the new insertion value.


import java.util.Scanner;

public class Lab519 {
    public static void main(String[] args) {
		int length = 5;
		int[] numbers = { 5, 20, 30, 35, 50, 0, 0, 0, 0, 0 };
		int insert_value, idx, i;
        Scanner scnr = new Scanner(System.in);
		
        insert_value = scnr.nextInt();
        scnr.close();
        idx=0;
        for(idx=0;idx<=numbers[0];idx++){
            if(numbers[idx]>=insert_value){
            break;
            }
        }

        for(i=length-1;i>=idx;i--){
            numbers[i+1]=numbers[i];
        }
        numbers[idx]=insert_value;
        if(length < numbers.length){
            length+=1;
        }
	
		for (i = 0; i < length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
	}

}


