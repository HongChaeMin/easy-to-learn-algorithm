package org.example.chapter4sort.example;

public class HeepSort2 {

	public static void main(String[] args) {
		int[] a = { 21, 10, 12, 20, 25, 13, 15, 22 };
		buildHeap(a);
		heapSort(a);
		for (int j : a) {
			System.out.println(j);
		}
	}

	static void heapSort(int[] arr) {
		int endNodeNumber = arr.length - 1;
		while(endNodeNumber > 1) {
			swap(arr, 1, endNodeNumber);
			endNodeNumber--;
			pushDown(arr, 1, endNodeNumber);
		}
	}

	static void buildHeap(int[] arr) {
		int endNodeNumber = arr.length - 1;
		int tempNodeNumber = endNodeNumber / 2 + 1;

		while(tempNodeNumber > 1) {
			tempNodeNumber--;
			pushDown(arr, tempNodeNumber, endNodeNumber);
		}
	}

	static void pushDown(int[] arr, int tempNodeNumber, int endNodeNumber) {
		int y = findLarger(arr, tempNodeNumber, endNodeNumber);

		while(arr[tempNodeNumber] < arr[y]){
			swap(arr, tempNodeNumber, y);
			tempNodeNumber = y;
			y = findLarger(arr, tempNodeNumber, endNodeNumber);
		}
	}

	static int findLarger(int[] arr, int tempNodeNumber, int endNodeNumber){
		int tmp = tempNodeNumber * 2 + 1;
		int y = tempNodeNumber;

		if(tmp <= endNodeNumber) {
			if(arr[tempNodeNumber] < arr[tmp])
				y = tmp;
			if(arr[y] < arr[tmp-1])
				y = tmp-1;
		}
		else if(tmp-1 <= endNodeNumber) {
			if(arr[tempNodeNumber] < arr[tmp-1])
				y = tmp-1;
		}
		return y;
	}

	static void swap(int[] a, int i, int j) {
		int tmp = a[j];
		a[j] = a[i];
		a[i] = tmp;
	}

}
