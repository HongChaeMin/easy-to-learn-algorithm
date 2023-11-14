package org.example.chapter4sort.example;

public class CountingSort {

	public static void main(String[] args) {
		int[] array = new int[100];
		int[] counting = new int[31];
		int[] result = new int[100];

		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*31);
		}

		// Counting Sort
		// 과정 1
		for (int j : array) {
			counting[j]++;
		}

		// 과정 2
		for(int i = 1; i < counting.length; i++) {
			counting[i] += counting[i - 1];
		}

		// 과정 3
		for(int i = array.length - 1; i >= 0; i--) {
			int value = array[i];
			counting[value]--;
			result[counting[value]] = value;
		}

		/* 비교 출력 */

		// 초기 배열
		System.out.println("array[]");
		for(int i = 0; i < array.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(array[i] + "\t");
		}
		System.out.println("\n\n");


		// Counting 배열
		System.out.println("counting[]");
		for(int i = 0; i < counting.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(counting[i] + "\t");
		}
		System.out.println("\n\n");


		// 정렬된 배열
		System.out.println("result[]");
		for(int i = 0; i < result.length; i++) {
			if(i % 10 == 0) System.out.println();
			System.out.print(result[i] + "\t");
		}
		System.out.println();
	}

}
