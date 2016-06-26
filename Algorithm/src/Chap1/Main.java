package Chap1;

import java.util.Scanner;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n;

		n = scanner.nextInt();

		int[][] score = new int[n][n];

		for (int i = 0; i < n; i++) {

			int temp = scanner.nextInt();

			for (int j = 0; j < n; j++) {

				score[i][n - j - 1] = temp % 10;
				temp = temp / 10;

			}

		}
		
		

	}

}
