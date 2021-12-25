package com.tejas;

public class P2ShortRangeCheck{
	public static void main(String[] args)
	{
		short s1=127;
		System.out.println(s1);

		short s2=32768;
		System.out.println(s2);//incompitable types: possible loss of precision from int to byte

		short s3=true;
		System.out.println(s3);//incompitable types: boolean cannot be converted to byte

		short s4="tejas";
		System.out.println(s4);//incompitable types: String cannot be converted to byte

		short s5=10.5;//incompatible types: possible lossy conversion from double to byte
		System.out.println(s5);
	}
}