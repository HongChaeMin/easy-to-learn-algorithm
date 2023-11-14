package org.example.chapter4sort.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back10989 {
	public static void main(String[] args) throws IOException {

		int[] counting = new int[10001];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int length = Integer.parseInt(br.readLine());

		int[] array = new int[length];
		int[] result = new int[length];

		for (int i = 0; i < length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}

		br.close();

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

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			sb.append(result[i]).append("\n");
		}
		System.out.println(sb);
	}

}
