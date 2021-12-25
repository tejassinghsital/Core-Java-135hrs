package com.tejas;

public class P4BooleanRangeCheck{
	public static void main(String[] args)
	{
		boolean b1=false;
		System.out.println(b1);

		boolean b2=0;
		System.out.println(b2);//incompitable types: int cannot be converted to boolean

		boolean b3=True;
		System.out.println(b3);//error: cannot find symbol

		boolean b4="true";
		System.out.println(b4);//incompitable types: String cannot be converted to boolean

		boolean b5=10.5;//incompatible types: double cannot be converted to boolean
		System.out.println(b5);
	}
}