package com.tejas;

public class Lengthtest{
	public static void main(String[] args){
		int[] x= new int[6];
		System.out.println(x.length());//error: Cannot find symbol Symbol: length() method
										// symbol:   variable x
  								// 		location: class LengthMehtodTest

		System.out.println(x.length);

		}
}
