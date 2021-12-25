package com.tejas;

public class P5BooleanDoubt{
	public static void main(String[] args)
	{
		int x=0;
		if(x)// error: incompatible types: int cannot be converted to boolean
		{
			System.out.print("Hello");
		}
		else
		{
			System.out.print("Hi");
		}
	}
}