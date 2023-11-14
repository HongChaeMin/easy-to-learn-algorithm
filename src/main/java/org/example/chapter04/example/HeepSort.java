package org.example.chapter04.example;

public class HeepSort {

	public static void main(String[] args) {
		int[] a = { 21, 10, 12, 20, 25, 13, 15, 22 };
		heepSort(a, a.length);
		for (int j : a) {
			System.out.println(j);
		}
	}

	static void heepSort(int[] a, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heepify(a, n, i);
		}
		for (int i = n - 1; i >= 0; i--) {
			int tmp = a[0];
			a[0] = a[i];
			a[i] = tmp;
			heepify(a, i, 0);
		}
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
			int tmp = a[i];
			a[i] = a[smaller];
			a[smaller] = tmp;
			heepify(a, n, smaller);
		}
	}

}
