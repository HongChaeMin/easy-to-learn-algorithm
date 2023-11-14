package org.example.chapter04.quiz;

import java.util.Scanner;

public class Back24090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int[] arr = new int[a];

		for (int i = 0; i < a; i++) arr[i] = sc.nextInt();

		quickSort(arr, 0, arr.length - 1, b);

		System.out.println(-1);
	}

	static void quickSort(int[] a, int left, int right, int count) {
		if (left < right) {
			int pivot = partition(a, left, right, count);
			quickSort(a, left, pivot - 1, count);
			quickSort(a, pivot + 1, right, count);
		}
	}

	static int partition(int[] a, int left, int right, int count) {
//		int pivot = a[left];
//		int i = left;
//		int j = right;
//
//		while (i < j) {
//			while (pivot < a[j]) j--;
//			while (i < j && pivot >= a[i]) i++;
//			swap(a, i, j, count);
//		}
//		a[left] = a[i];
//		a[i] = pivot;
//		return i;
		int x = a[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (a[j] <= x) {
				i++;
				swap(a, i, j, count);
			}
		}
		if (i + 1 != right) swap(a, i + 1, right, count);
		return i + 1;
	}

	private static void swap(int[] a, int i, int j, int count) {
		if (a[j] == a[i]) return;
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
