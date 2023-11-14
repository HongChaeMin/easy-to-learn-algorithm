package org.example.chapter4sort.quiz;

import java.util.Scanner;

public class Back24173 {

	public static int count;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		count = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) arr[i] = sc.nextInt();

		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			heepify(arr, arr.length, i);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			swap(arr, i, 0);
			heepify(arr, i, 0);
		}

		for (int n : arr) {
			System.out.println(n);
		}


		System.out.println(-1);
	}

	static void heepify(int[] a, int n, int i) {
		int smaller = i;
		int left = i * 2 + 1;
		int right = i * 2 + 2;

		if (left < n && a[left] > a[smaller]) {
			smaller = left;
		}
		if (right < n && a[right] > a[smaller]) {
			smaller = right;
		}
		if (smaller != i) {
			swap(a, i, smaller);
			heepify(a, n, smaller);
		}
	}

	static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
		count--;
		if (count == 0) {
			System.out.println(a[i] + " " + a[j]);
			System.exit(0);
		}
	}

}
