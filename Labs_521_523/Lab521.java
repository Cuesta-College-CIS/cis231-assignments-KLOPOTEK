package Labs_521_523;

// We will merge two integer arrays. Your program should use an extra array 
// for the merged array. The array that has the shorter length than another one 
// will be placed in the ahead, the longer one should be placed at the last of 
// the result array. When two arrays have the same length, any can be placed 
// in the first half.

// The input begins with an integer indicating the number of values follow for 
// the 1st array. after the first array values, there is an another integer 
// indicating the number of values follow for the 1st array.

import java.util.Scanner;

public class Lab521 {
    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N1 = scnr.nextInt();
		int[] num1 = new int[N1];
		for (int i = 0; i < N1; i++)
			num1[i] = scnr.nextInt();

		int N2 = scnr.nextInt();
		int[] num2 = new int[N2];
		for (int i = 0; i < N2; i++)
			num2[i] = scnr.nextInt();

        int[] result = new int[N1+N2];
        if(N1<=N2){
            for(int i=0; i<N1; i++)
                result[i] = num1[i];
            for(int i=0; i<N2; i++)
                result[i+N1] = num2[i];
        }
        else{
            for(int i=0; i<N2; i++)
                result[i] = num2[i];
            for(int i=0; i<N1; i++)
                result[i+N2] = num1[i];
        }
        for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}

