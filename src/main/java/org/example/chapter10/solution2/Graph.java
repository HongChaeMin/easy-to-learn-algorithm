package org.example.chapter10.solution2;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {

	private final int v;
	private final List<List<Edge>> list = new ArrayList<>();

	public Graph(int v) {
		this.v = v;
		for (int i = 0; i < v; i++) list.add(new ArrayList<>());
	}

	public void addEdge(int src, int dest, int weight) {
		list.get(src - 1).add(new Edge(dest - 1, weight));
		list.get(dest - 1).add(new Edge(src - 1, weight));
	}

	public List<Edge> maximumSpanningTree() {
		List<Edge> maxSpanningTree = new ArrayList<>();
		boolean[] visited = new boolean[v];
		PriorityQueue<Edge> maxHeap = new PriorityQueue<>((a, b) -> b.weight - a.weight);

		visited[0] = true;
		for (Edge edge : list.get(0)) {
			maxHeap.offer(edge);
		}

		while (!maxHeap.isEmpty()) {
			Edge currentEdge = maxHeap.poll();
			int u = currentEdge.dest;

			if (visited[u]) continue;

			visited[u] = true;
			maxSpanningTree.add(currentEdge);

			for (Edge edge : list.get(u)) {
				if (!visited[edge.dest]) {
					maxHeap.add(edge);
				}
			}
		}

		return maxSpanningTree;
	}

}
