package com.tejas;

public class P6NotOperator{
	public static void main(String[] args){
		System.out.println(!4);//gives error 
// error: bad operand type int for unary operator '!'
		System.out.println(!true);//give false(Boolean complement operator or ! only works on boolean values)

	}
}