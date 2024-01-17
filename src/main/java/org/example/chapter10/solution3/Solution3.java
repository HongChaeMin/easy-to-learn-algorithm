package org.example.chapter10.solution3;

import java.util.Scanner;

// Floyd-Warshall
// https://github.com/jesuissumin/al_study/blob/main/7.Graph/3.%20All%20Pairs%20Shortest%20Paths/3.%20All%20Pairs%20Shortest%20Paths.pdf
public class Solution3 {

	static final int INF = 1000000000;

	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] graph = new int[n + 1][n + 1];

		initGraph(graph, m);

		int[][] result = floyd(graph, n);

		int sum = sum(result);
		System.out.println("sum: " + sum);
	}

	public static void initGraph(int[][] graph, int n) {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph.length; j++) {
				if (i == j) continue;
				graph[i][j] = INF;
			}
		}

		for (int i = 0; i < n; i++) {
			int v = sc.nextInt();
			int w = sc.nextInt();
			int cost = sc.nextInt();

			graph[v][w] = cost;
		}
	}

	public static int[][] floyd(int[][] graph, int n) {
		for (int k = 1; k <= n; k++) {
			for (int i = 1; i <= n ; i++) {
				for (int j = 1; j <= n; j++) {
					graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
				}
			}
		}
		return graph;
	}

	public static int sum(int[][] graph) {
		int sum = 0;
		for (int[] ints : graph) {
			for (int j = 0; j < graph.length; j++) {
				if (ints[j] != INF) sum += ints[j];
			}
		}
		return sum;
	}

}
