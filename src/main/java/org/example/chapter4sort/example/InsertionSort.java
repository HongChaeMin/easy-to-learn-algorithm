package org.example.chapter4sort.example;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = { 33, 21, 523456, 2423, 233, 5, 2, 99999,  4, 6, 1, 12368, 3, 1234, 43, 234, 132, 677, 2456, 234, 68, 345, 7777, 4567, 55, 564, 123, 5, 2342, 56387 };
		insertionSort(a, a.length);
		for (int j : a) {
			System.out.println(j);
		}
	}

	static void insertionSort(int[] a, int n) {
		for(int i = 1; i < n; i++) {
			int key = a[i];
			int j;
			for(j = i - 1; j >= 0 && a[j] > key; j--){
				a[j + 1] = a[j]; // 레코드의 오른쪽으로 이동
			}
			a[j + 1] = key;
		}
	}
}
