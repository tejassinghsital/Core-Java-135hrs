package com.tejas;

public class ArraySizeLimit{
	public static void main(String[] args){
		int[] x= new int[2147483647];
		System.out.println(x.length);//Runtime error:Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit


		}
}
