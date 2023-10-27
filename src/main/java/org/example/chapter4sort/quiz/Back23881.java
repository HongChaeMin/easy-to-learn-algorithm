package org.example.chapter4sort.quiz;

import java.util.Scanner;

public class Back23881 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) arr[i] = sc.nextInt();

		for (int i = arr.length - 1; i > 0; i--) {
			int maxIdx = 0;
			for (int j = 0; j <= i; j++) {
				if (arr[j] > arr[maxIdx]) maxIdx = j;
			}
			
			if (arr[i] != arr[maxIdx]) {
				int tmp = arr[i];
				arr[i] = arr[maxIdx];
				arr[maxIdx] = tmp;
				b--;
			}
			
			if (b == 0) {
				System.out.println(arr[maxIdx] + " " + arr[i]);
				System.exit(0);
			}
		}
		System.out.println(-1);

	}

}
