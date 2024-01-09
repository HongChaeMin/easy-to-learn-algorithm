package org.example.chapter07.quiz;

import java.util.Scanner;

public class Back10001 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int m = sc.nextInt();

		int count = 0;
		if (n / 10 < 1) {
			for (int i = 97; i < 123; i++) {
				if (hash(String.valueOf((char) i), m) == k) {
					count++;
				}
			}
		} else {
			for (int i = 97; i < 123; i++) {
				for (int j = 97; j < 123; j++) {
					if (hash(String.valueOf((char) i) + String.valueOf((char) j), m) == k) {
						count++;
					}
				}
			}
		}
		System.out.println(count);

	}

	public static int hash(String string, int mod) {
		if (string.length() == 0) {
			return 0;
		}
		String wrod = string.substring(0, string.length() - 1);
		char lastLetter = string.charAt(string.length() - 1);
		return ((hash(wrod, mod) * 33) ^ ord(lastLetter)) % (int) Math.pow(2, mod);
	}

	public static int ord(char letter) {
		return (int) letter - 96;
	}

}
