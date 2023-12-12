package com.String;

import java.util.*;

public class Assingment 
{
	public static void main(String[] args) 
	{
		List<Integer> l=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		int n;
		int s;
		do 
		{
			n=sc.nextInt();
			l.add(n);
			System.out.print("do you want continue press 1");
			s=sc.nextInt();
		}while(s==1);
		int markavg=finavg(l);
		System.out.println(markavg);
		
	}
	public static int finavg(List<Integer> l)
	{
		int p=l.size();
		int sum=0;
		for(int i=0;i<p;i++)
		{
			int r=(Integer)l.get(i);
			sum+=r;
		}    
		int avg=sum/p;
		return avg;
	}
}

