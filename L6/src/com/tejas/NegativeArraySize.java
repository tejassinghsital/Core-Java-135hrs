package com.tejas;

public class NegativeArraySize{
	public static void main(String[] args){
		int[] x= new int[-3];//error:
		System.out.println(x.length);//Exception in thread "main" java.lang.NegativeArraySizeException: -3


		}
}
