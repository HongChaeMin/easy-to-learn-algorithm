package org.example.chapter10.solution1;

// DAG-ShortestPath(G, r)
//{
//	1
//	for each u ㅌ V
//		d[u] <- infinity;
//	d[r] <- 0;
//	2. G의 정점들을 위상 정렬
//	3
//	for each u E V (위상 정렬 순서로)
//		for each v ㅌ L(u) // L(u): u로부터 연결된 정점들의 집합
//			if (d[u] + w(u, v) < d[v]) then {
//				d[v] <- d[u] + w(u, v);
//				prev[v] <- u;
//			}
//	}
//}

import java.util.*;

public class NotSolution1 {

	public static int v, e;
	public static int[] indegree = new int[100001];
	public static List<List<Integer>> graph = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		v = sc.nextInt();
		e = sc.nextInt();

		// 1. 노드 세팅하기
		setNode(sc);

		// 2. 노드들을 위상 정렬하기
		List<Integer> sorted = topologicalSort();

		for (Integer integer : sorted) {
			System.out.print(integer + " ");
		}

		// 3. 위상 정렬 순서로 노드들을 방문하면서 최단 거리를 구하기
//		int[] distance = new int[100001];
//		Arrays.fill(distance, Integer.MAX_VALUE);
//		for (int now : sorted) {
//			for (int j = 0; j < graph.get(now).size(); j++) {
//				int next = graph.get(now).get(j);
//				if (distance[next] > distance[now] + 1) {
//					distance[next] = distance[now] + 1;
//				}
//			}
//		}

//		for (int i = 1; i <= v; i++) {
//			System.out.println(distance[i]);
//		}
	}

	public static void setNode(Scanner sc) {
		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<>());
		}

		for (int i = 0; i < e; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			graph.get(a).add(b);
			indegree[b]++;
		}
	}

	public static List<Integer> topologicalSort() {
		List<Integer> result = new ArrayList<>();
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < v; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		while (!queue.isEmpty()) {
			int now = queue.poll();
			result.add(now);

			for (int i = 0; i < graph.get(now).size(); i++) {
				indegree[graph.get(now).get(i)]--;
				if (indegree[graph.get(now).get(i)] == 0) {
					queue.add(graph.get(now).get(i));
				}
			}
		}

		return result;
	}

}

class Node {
	private int v;
	private int w;

	public Node(int v, int w) {
		this.v = v;
		this.w = w;
	}
}
