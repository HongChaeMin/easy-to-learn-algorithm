package org.example.chapter10.solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

// prim 알고리즘
// https://github.com/jesuissumin/al_study/blob/main/7.Graph/2.%20%EC%B5%9C%EB%8C%80%EC%8B%A0%EC%9E%A5%ED%8A%B8%EB%A6%AC/2.%20%EC%B5%9C%EB%8C%80%EC%8B%A0%EC%9E%A5%ED%8A%B8%EB%A6%AC.pdf
// https://www.tutorialspoint.com/maximum-spanning-tree-using-prim-rsquo-s-algorithm
public class Solution2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		Graph graph = new Graph(n);

		for (int i = 0; i < m; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int weight = sc.nextInt();
			graph.addEdge(src, dest, weight);
		}

		List<Edge> maxSpanningTree = graph.maximumSpanningTree();

		int sum = 0;
		for (Edge edge : maxSpanningTree) {
			sum += edge.weight;
		}
		System.out.println("Maximum Spanning Tree weight: " + sum);
	}

}
