package org.example.chapter4sort.example;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 6, 1, 3 };
		selectionSort(a, a.length);
		for (int n : a) {
			System.out.println(n);
		}
	}

	static void selectionSort(int[] a, int n) {
		for (int i = n - 1; i > 1; i--) {
			// 배열 중 가장 큰 수를 찾는다.
			int maxIdx = 0;
			for (int j = 0; j <= i; j++) {
				if (a[j] > a[maxIdx]) maxIdx = j;
			}
			// 값을 바꿔준다.
			int tmp = a[i];
			a[i] = a[maxIdx];
			a[maxIdx] = tmp;
		}
	}

}