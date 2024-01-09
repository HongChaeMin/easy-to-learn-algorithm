package org.example.chapter07.quiz;

import java.util.Scanner;

public class Back21108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();
		int[][] arr = new int[cases][2];

		for (int i = 0; i < cases; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		for (int i = 0; i < cases; i++) {
			int mod = arr[i][1];
			int[] result = new int[999999];
			int count = 0;

			for (int j = 0; j < arr[i][0]; j++) {
				int hash = hash(j, mod);

				if (result[hash] != 0) {
					while (result[hash] != 0) {
						if (result[hash] != 0) result[hash] = j;
						count++;
						hash++;
					}
				}
				result[hash] = j;
			}
			System.out.println(count);
		}
	}

	public static int hash(int x, int mod) {
		return x * x % mod;
	}

}
