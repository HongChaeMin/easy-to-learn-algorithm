package org.example.chapter04.quiz;

import java.util.Scanner;

public class Back24051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) arr[i] = sc.nextInt();

		for(int i = 2; i < arr.length; i++) {
			int key = arr[i];
			int j;
			for(j = i - 1; j >= 0 && arr[j] > key; j--){
				arr[j + 1] = arr[j];
				b--;
				if (b == 0) {
					System.out.println(arr[j + 1]);
					System.exit(0);
				}
			}
			if (j + 1 != i) {
				arr[j + 1] = key;
				b--;
				if (b == 0) {
					System.out.println(arr[j + 1]);
					System.exit(0);
				}
			}
		}
		System.out.println(-1);
	}

}
