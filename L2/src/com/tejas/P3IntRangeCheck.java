package com.tejas;

public class P3IntRangeCheck{
	public static void main(String[] args)
	{
		int i1=2147483647;
		System.out.println(i1);

		int i2=2147483648l;
		System.out.println(i2);//incompitable types: possible loss of precision from int to byte

		int i3=true;
		System.out.println(i3);//incompitable types: boolean cannot be converted to byte

		int i4="tejas";
		System.out.println(i4);//incompitable types: String cannot be converted to byte

		int i5=10.5;//incompatible types: possible lossy conversion from double to byte
		System.out.println(i5);
	}
}