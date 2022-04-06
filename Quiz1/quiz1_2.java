package Quiz1;

import java.util.Scanner;

public class quiz1_2 {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		int sum1 = 0;
		int sum2 = 0;

		int[][] matrix1 = {
				{ 2, 5, 10 },
				{ 3, 6, 9 },
				{ 1, 2, 3 } };
		int[][] matrix2 = {
				{ 10, 20 },
				{ 30, 40 },
				{ 50, 60 } };
		int rowidx = scnr.nextInt();

		for (int i = 0; i < 3; i++) {
			sum1 += matrix1[rowidx][i] * matrix2[i][0];
		}
		for (int i = 0; i < 3; i++) {
			sum2 += matrix1[rowidx][i] * matrix2[i][1];
		}
		System.out.println(sum1 + " " + sum2);
		scnr.close();
	}

}