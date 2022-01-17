package com.tejas;

public class P2ListingOnIncDec{
	public static void main(String[] args){
		int x=10;
		int y=++(++x);
		System.out.println(y);//Compile time error->src\com\tejas\P1IncDecOnCOnst.java:8: error: unexpected type
  													//               y=++(++x);
  													//                   ^
  													// required: variable
  													// found:    value

	}
}