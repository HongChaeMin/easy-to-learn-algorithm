package org.example.chapter5.example;

public class SelectSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 4, 9, 1, 6, 2, 7 };
		int result = select(arr, 0, arr.length - 1, 6);
		System.out.println(result);
	}

	static int select(int[] arr, int p, int r, int i) {
		if (p == r) return arr[p];
		int q = partition(arr, p, r);
		int k = q - p + 1;

		if (i < k) return select(arr, p, q - 1, i);
		else if (i == k) return arr[q];
		else return select(arr, q + 1, r, i - k);
	}

	static int partition(int[] a, int left, int right) {
		int pivot = a[left];
		int i = left;
		int j = right;

		while (i < j) {
			while (pivot < a[j]) j--;
			while (i < j && pivot >= a[i]) i++;
			swap(a, i, j);
		}
		a[left] = a[i];
		a[i] = pivot;
		return i;
	}

	private static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}

}
