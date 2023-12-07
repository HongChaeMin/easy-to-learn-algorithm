package org.example.chapter07.quiz;

public class Back10001 {
	public static void main(String[] args) {
		System.out.println("f(a) = " + hash("a", 10));
		System.out.println("f(aa) = " + hash("aa", 10));
		System.out.println("f(kit) = " + hash("kit", 10));
		System.out.println("f(z) = " + hash("z", 10));
	}

	public static int hash(String string, int mod) {
		if (string.length() == 0) {
			return 0;
		}
		String wrod = string.substring(0, string.length() - 1);
		char lastLetter = string.charAt(string.length() - 1);
		return ((hash(wrod, mod) * 33) ^ ord(lastLetter)) % ((mod) ^ 2);
	}

	public static int ord(char letter) {
		return (int) letter - 96;
	}


}
