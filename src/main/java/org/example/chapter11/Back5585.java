package org.example.chapter11;

import java.util.Scanner;

public class Back5585 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int change = 1000 - money;
		int count = 0;

		while (change / 500 > 0) {
			change -= 500;
			count++;
		}

		while (change / 100 > 0) {
			change -= 100;
			count++;
		}

		while (change / 50 > 0) {
			change -= 50;
			count++;
		}

		while (change / 10 > 0) {
			change -= 10;
			count++;
		}

		while (change / 5 > 0) {
			change -= 5;
			count++;
		}

		while (change > 0) {
			change -= 1;
			count++;
		}

		System.out.println(count);
	}

}
