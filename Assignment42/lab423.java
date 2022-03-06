package Assignment42;

import java.util.Scanner;

public class lab423 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int Max = a;
		int Min = a;

		// You used 5 variables a,b,c,d,e to take user inputs
		// But, we cannot ensure there are how many inputs when we run this program.
		// Thus, we use the same variable to save user input at each iteration.
		// We will use the variable userInput within a while loop structure

		// while (true) {
		// userInput = sc.nextInt();
		// if ( userinput is negative vlaue)
		// break;
		// find the min anx max within this loop;
		// }
		// Subtract min and max from sum;
		// Caculate average ;
		// print the sum and average;

		if (b > Max) {
			Max = b;
		}
		if (c > Max) {
			Max = c;
		}
		if (d > Max) {
			Max = d;
		}
		if (e > Max) {
			Max = e;
		}

		if (b < Min) {
			Min = b;
		}
		if (c < Min) {
			Min = c;
		}
		if (d < Min) {
			Min = d;
		}
		if (e < Min) {
			Min = e;
		}
		int sum = a + b + c + d + e - Max - Min;

		float avg = sum / 5;

		// Use the below line to print the result
		System.out.printf("%d %.2f\n", sum, avg);
	}
}
