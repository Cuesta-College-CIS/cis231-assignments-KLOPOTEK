package Labs_524_526;

// In this program we will use two dimensional array N x M, which is the number of rows and 
// columns, respectively. Input begins with the number of rows N and the number of columns 
// M followed by N x M integer values.
// Print all elements in the row that has the least summation
// Print all elements in the row that has the greatest summation
// Print all elements in the column that has the least summation
// Print all elements in the column that has the greatest summation

import java.util.Scanner;

public class Lab525 {
    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int N = scnr.nextInt();
		int M = scnr.nextInt();
        int sum;
        int rowmin=0;
        int rowmax=0;
        int rowmin_idx=0;
        int rowmax_idx=0;
        int colmin=0;
        int colmax=0;
        int colmin_idx=0;
        int colmax_idx=0;

		int[][] numbers = new int[N][M];

        for( int i =0; i<N; i++){
            for(int j=0; j<M; j++){
                numbers[i][j]=scnr.nextInt();
            }

        }

        for(int i=0; i<N; i++){
            sum=0;
            for(int j=0; j<M; j++){
                sum += numbers[i][j];
            }
            if ((i == 0) || (rowmin > sum)){
                rowmin = sum;
                rowmin_idx = i;
            }
            if ((i == 0) || (rowmax < sum)){
                rowmax = sum;
                rowmax_idx = i;
            }
        }
           
        for(int j=0; j<M; j++){
            System.out.print(numbers[rowmin_idx][j]+" ");
        }
        System.out.println();
        for(int j=0; j<M; j++){
            System.out.print(numbers[rowmax_idx][j]+" ");
        }
        System.out.println();


        for(int i=0; i<M; i++){
            sum=0;
            for(int j=0; j<N; j++){
                sum += numbers[j][i];
            }
            if ((i == 0) || (colmin > sum)){
                colmin = sum;
                colmin_idx = i;
            }
            if ((i == 0) || (colmax < sum)){
                colmax = sum;
                colmax_idx = i;
            }           
        }   
        for(int i=0; i<N; i++){
            System.out.print(numbers[i][colmin_idx]+" ");
        }
        System.out.println();
        for(int i=0; i<N; i++){
            System.out.print(numbers[i][colmax_idx]+" ");
        }
        System.out.println();
        scnr.close();
	}

}



