package com.tejas;

public class ArrayClassCheck{
	public static void main(String[] args){
		int[] x1= new int[3];
		System.out.println(x1.getClass().getName());// for 1d we get [I as output

		int[][] x2=new int[3][5];//we can't give any other array name x even it's different in dimension.
		System.out.println(x2.getClass().getName());//for 2d we get [[I as output

		boolean[] b= new boolean[2];
		System.out.print(b.getClass().getName());
	}
}
