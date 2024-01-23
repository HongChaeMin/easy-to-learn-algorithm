package org.example.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Back27653 {
	static int N;
	static List<List<Integer>> tree = new ArrayList<>();
	static long[] weight;
	static long answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		weight = new long[N+1];

		for (int i = 0; i <= N; i++) {
			tree.add(new ArrayList<>());
		}

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= N; i++) {
			weight[i] = Long.parseLong(st.nextToken());
		}

		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			tree.get(a).add(b);
			tree.get(b).add(a);
		}

		dfs(1, -1);

		System.out.println(answer);
	}

	static void dfs(int cur, int parent) {
		for (int next : tree.get(cur)) {
			if (next != parent) {
				dfs(next, cur);
				weight[cur] += weight[next];
				answer += Math.abs(weight[next]);
			}
		}
	}
}