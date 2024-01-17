package org.example.chapter10.solution4;

import java.util.*;

public class Solution4 {

	public static List<LinkedList<Integer>> array = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		array.add(new LinkedList<>());
		for (int i = 1; i <= n; i++) {
			array.add(new LinkedList<>());
		}

		for (int i = 0; i < n; i++) {
			int index = sc.nextInt();

			while (true) {
				int v = sc.nextInt();
				if (v == -1) {
					break;
				}
				int w = sc.nextInt();
				LinkedList<Integer> linkedList = array.get(index);
				linkedList.addLast(w);
			}
		}

		//

	}

}
