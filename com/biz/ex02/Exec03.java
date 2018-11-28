package com.biz.ex02;

public class Exec03 {

	public static void main(String[] args) {
		int a1 = 30;
		a(a1);
		System.out.println(a1);

		int[] b1 = { 10, 20 };
		System.out.println(b1[0]);
		b(b1);
		System.out.println(b1[0]);
	}

	public static void b(int[] n) {
		n[0] = 300;

	}

	public static void a(int n) {
		n = 300;
	}
}
