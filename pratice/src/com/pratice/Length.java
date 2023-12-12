package com.pratice;

import java.util.*;

public class Length 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		count(s);
	}

	public static void count(String s) 
	{
		List<Character> l=new ArrayList<>();
		int max=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(l.contains(c))
			{
				if(max<=l.size())
				{
					max=l.size();
				}
				for(int j=l.indexOf(c);j>=0;j--)
				{
					l.remove(j);
				}
				l.add(c);
				
			}
			else
			{
				l.add(c);
				if(max<=l.size())
				{
					max=l.size();
				}
			}
			
		}
		System.out.println(max);
		
	}
}
