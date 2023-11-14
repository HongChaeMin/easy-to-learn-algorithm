package org.example.chapter04.example;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 33, 21, 523456, 2423, 233, 5, 2, 99999,  4, 6, 1, 12368, 3, 1234, 43, 234, 132, 677, 2456, 234, 68, 345, 7777, 4567, 55, 564, 123, 5, 2342, 56387 };
		bubbleSort(a, a.length);
	}

	static void bubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 1; i--) {
			boolean sorted = true;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					// 값을 바꿔준다.
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					sorted = false;
				}
			}
			if (sorted) return;
		}
	}

}
