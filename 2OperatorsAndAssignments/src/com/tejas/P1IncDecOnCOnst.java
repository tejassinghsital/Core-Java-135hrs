package com.tejas;

public class P1IncDecOnCOnst{
	public static void main(String[] args){
		int x=10;
		int y=++x;
		System.out.println(y);//11
		y=++10;
		System.out.println(y);//Compile time error->src\com\tejas\P1IncDecOnCOnst.java:8: error: unexpected type
  													//               y=++10;
  													//                   ^
  													// required: variable
  													// found:    value

	}
}