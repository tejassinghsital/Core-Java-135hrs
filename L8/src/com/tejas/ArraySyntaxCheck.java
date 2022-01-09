package com.tejas;

public class ArraySyntaxCheck{
	public static void main(String[] args){
		int[] x1;
		x1={10,20,30};//error: illegal start of statement
		System.out.println(x1[0]);

		int[] x2;
		x2=new int[3];//run without any error
		System.out.println(x2[0]);
}
}