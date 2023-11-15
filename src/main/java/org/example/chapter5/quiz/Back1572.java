package org.example.chapter5.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Back1572 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arrLength = sc.nextInt();
		int idx = sc.nextInt();

		int[] arr = new int[arrLength];
		int[] eqArr = new int[arrLength];

		for (int i = 0; i < arrLength; i++) arr[i] = sc.nextInt();
		for (int i = 0; i < arrLength; i++) eqArr[i] = sc.nextInt();

		select(eqArr, arr, 0, arr.length - 1, idx);

		System.out.println(-1);
	}

	static int select(int[] eqArr, int[] arr, int p, int r, int i) {
		if (p == r) return arr[p];
		int q = partition(eqArr, arr, p, r);
		int k = q - p + 1;

		if (i < k) return select(eqArr, arr, p, q - 1, i);
		else if (i == k) return arr[q];
		else return select(eqArr, arr, q + 1, r, i - k);
	}

	static int partition(int[] eqArr, int[] a, int left, int right) {
		int pivot = a[left];
		int i = left;
		int j = right;

		while (i < j) {
			while (pivot < a[j]) j--;
			while (i < j && pivot >= a[i]) i++;
			swap(eqArr, a, i, j);
		}
		a[left] = a[i];
		a[i] = pivot;
		return i;
	}

	private static void swap(int[] eqArr, int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;

		boolean flag = Arrays.equals(eqArr, a);
		if (flag) {
			for (int e: a) System.out.print(e + " ");
			System.out.println();
			for (int s: eqArr) System.out.print(s + " ");
			System.out.println();
			System.out.println(1);
			System.exit(0);
		}
	}

}
