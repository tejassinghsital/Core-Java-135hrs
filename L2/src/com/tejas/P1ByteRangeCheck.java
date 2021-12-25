package com.tejas;

public class P1ByteRangeCheck{
	public static void main(String[] args)
	{
		byte b1=127;
		System.out.println(b1);

		byte b2=128;
		System.out.println(b2);//incompitable types: possible loss of precision from int to byte

		byte b3=true;
		System.out.println(b3);//incompitable types: boolean cannot be converted to byte

		byte b4="tejas";
		System.out.println(b4);//incompitable types: String cannot be converted to byte

		byte b5=10.5;//incompatible types: possible lossy conversion from double to byte
		System.out.println(b5);
	}
}