package com.certification.chap1;

import java.util.ArrayList;
import java.util.List;

public class Finalizer {
	private static List objects = new ArrayList();
	@Override
	protected void finalize() throws Throwable {
		objects.add(this); //Don't do this
//		System.out.println("Calling Finalize");
	}
	public static void main(String[] args) {
		Finalizer f = new Finalizer();
	}
}