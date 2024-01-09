package org.example.chapter09.play;

import java.util.Scanner;
class Solution4 {

	// https://github.com/jesuissumin/al_study/blob/main/6.DynamicPrograming/4.%20%EB%86%80%EC%9D%B4%ED%8C%90/4.%20%EB%86%80%EC%9D%B4%ED%8C%90.pdf
	// 10
	// 1 17 17 19 2 17 14 6 19 11
	// 1 19 16 6 13 15 16 13 7 2
	// 13 11 1 9 10 12 16 20 14 12

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] arr = new int[3][n];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();
		}

		int[][] memo = new int[6][n];

		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 6; j++) {
				int sum = caseBySum(j, arr[0][i], arr[1][i], arr[2][i]);
				memo[j][i] = sum + max;
			}
			for (int j = 0; j < 6; j++) {
				if (max < memo[j][i]) {
					max = memo[j][i];
				}
			}
		}

//		int max = 0;
//		for (int i = 0; i < 6; i++) {
//			if (max < memo[i][n-1]) {
//				max = memo[i][n-1];
//			}
//		}

//		System.out.println(max);


		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < n; j++)
				System.out.print(memo[i][j] + " ");
			System.out.println();
		}

	}

	public static int caseBySum(int caseType, int a, int b, int c) {
		return switch (caseType) {
			case 0 -> a - b;
			case 1 -> a - c;
			case 2 -> b - a;
			case 3 -> b - c;
			case 4 -> c - a;
			case 5 -> c - b;
			default -> 0;
		};
	}

}

