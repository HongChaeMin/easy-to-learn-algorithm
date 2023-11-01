package org.example.chapter4sort.example;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 21, 10, 12, 20, 25, 13, 15, 22 };
		mergeSort(a, 0, a.length - 1);
		for (int j : a) {
			System.out.println(j);
		}
	}

	static void mergeSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, mid, right);
		}
	}

	static void merge(int[] a, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		int[] tmp = new int[a.length];

		while (i <= mid && j <= right) {
			if (a[i] <= a[j]) {
				tmp[k++] = a[i++];
			} else {
				tmp[k++] = a[j++];
			}
		}

		while (i <= mid) {
			tmp[k++] = a[i++];
		}

		while (j <= right) {
			tmp[k++] = a[j++];
		}

		if (right + 1 - left >= 0) System.arraycopy(tmp, left, a, left, right + 1 - left);
	}

}
