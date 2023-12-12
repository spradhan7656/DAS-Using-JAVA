package com.pratice;

import java.util.Random;

public class RandomGenerator 
{
	public static void main(String[] args) 
	{
		Random rand=new Random();
		int i=rand.nextInt(2);
		System.out.println(i);
	}
}
