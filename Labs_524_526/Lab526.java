package Labs_524_526;

// This program counts the cross shape in two dimensional array N x M.

// We say there is a cross shape in the (i,j) position if and only if

// the cell (i,j ) is 1, and
// every up(i-1, j), down(i+1, j, left(i,j-1) and right(i,j+1) cell is 1

import java.util.Scanner;
import java.util.Arrays;

public class Lab526 {
    public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int N = scnr.nextInt();
		int M = scnr.nextInt();
		int[][] numbers = new int[N][M];
		int cnt = 0;
        
		try {
			for (int i = 0; i < numbers.length; i++)
				for (int j = 0; j < numbers[i].length; j++)
					numbers[i][j] = scnr.nextInt();
		} catch (Exception e) {
			System.err.println("Input Error");
			e.printStackTrace();
		}
		 for (int i = 0; i < numbers.length; i++){
             System.out.println(Arrays.toString(numbers[i]));
        }

for(int i=0; i<N; i++){
    for(int j=0; j<M; j++){
        if((numbers[i][j]==1) & (i!=0) & (i!=N-1) & (j!=0) & (j!=M-1)){
            int UP = numbers[i-1][j];
            int DOWN = numbers[i+1][j];
            int LEFT = numbers[i][j-1];
            int RIGHT = numbers[i][j+1];
            if((UP==1) & (DOWN==1) & (LEFT==1) & (RIGHT==1)){
                cnt++;
            }
        }
    }
}

		System.out.println(cnt);
		scnr.close();
	}

}