package Quiz1;

import java.util.Arrays;
import java.util.Scanner;

public class quiz1_1 {
	public static void main(String[] args) {

		int minval, minidx, tmp;

		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int[] numbers = new int[N];
		for (int i = 0; i < N; i++){
			numbers[i] = scnr.nextInt();
        }
        for(int j=0;j<5;j++){
            //  Find the minimum value and assign it to minval,
            //  also assign minimum value index to minidx.
            minval=numbers[N-1];
            minidx=N-1;
            for (int i = j; i<N; i++){
                if (numbers[i]<minval){
                    minval=numbers[i];
                    minidx=i;
                }
            }
            // Assign the minimum value in the array to the first index.
            tmp=numbers[j];
            numbers[j]=numbers[minidx];
            numbers[minidx]=tmp;

                System.out.println(Arrays.toString(numbers));
            
            
        }

       
		scnr.close();
	}

}