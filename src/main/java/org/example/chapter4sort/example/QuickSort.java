package org.example.chapter4sort.example;

public class QuickSort {
	public static void main(String[] args) {
		int[] a = { 21, 10, 12, 20, 25, 13, 15, 22 };
		quickSort(a, 0, a.length - 1);
		for (int j : a) {
			System.out.println(j);
		}
	}

	static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int pivot = partition(a, left, right);
			quickSort(a, left, pivot - 1);
			quickSort(a, pivot + 1, right);
		}
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
