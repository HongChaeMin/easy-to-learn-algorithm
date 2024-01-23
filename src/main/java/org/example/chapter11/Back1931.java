package org.example.chapter11;

import java.util.*;

public class Back1931 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Meeting[] meetings = new Meeting[n];

		for (int i = 0; i < n; i++) {
			meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
		}

		Arrays.sort(meetings);

		int count = 0;
		int time = 0;

		for (Meeting meeting : meetings) {
			if (time <= meeting.start()) {
				time = meeting.end();
				count++;
			}
		}

		System.out.println(count);
	}

	public record Meeting(int start, int end) implements Comparable<Meeting> {

		@Override
		public int compareTo(Meeting o) {
			if (this.end == o.end) {
				return this.start - o.start;
			}
			return this.end - o.end;
		}

	}

}

