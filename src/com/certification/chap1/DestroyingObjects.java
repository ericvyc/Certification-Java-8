package com.certification.chap1;
public class DestroyingObjects {
	public static void main(String[] args) {
		String one, two;
		one = new String("a");
		two = new String("b");
		one = two;
		String three = one;
		one = null;
	}
}