package org.example.chapter04.quiz;

import java.util.Scanner;

public class Back23968 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) arr[i] = sc.nextInt();

		for (int i = arr.length - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					b--;
				}
				if (b == 0) {
					System.out.println(arr[j] + " " + arr[j + 1]);
					System.exit(0);
				}
			}
		}
		System.out.println(-1);
	}

}
