package Labs_521_523;

// We will shuffle two integer arrays, and then make an extra array 
// with two array values.The program copies all elements of the first array and the second 
// array alternatively. The shuffle will start with the first array 
// element.The odd elements of the result array have the elements in 
// the first array and the even elements have the second array elements. 
// If there is no more elements in one array, the remainder of the 
// other one will be copied to the last of result array as itself.

import java.util.Scanner;

public class Lab522 {
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
      int min_len = (N1<N2) ? N1 : N2;

      for (int i =0; i < min_len; i++){
          result[2*i] = num1[i];
          result[2*i+1] = num2[i];
      }
      if (min_len == num1.length){
          for ( int i = 0; i<N2 -N1;i++)
                result[i+N1*2] = num2[i+N1];
      }else{
          for(int i =0; i <N1-N2; i++)
                result[i+N2*2] = num1[i+N2];
      }




		for (int v : result)
			System.out.print(v + " ");
		System.out.println();
		scnr.close();
	}

}

