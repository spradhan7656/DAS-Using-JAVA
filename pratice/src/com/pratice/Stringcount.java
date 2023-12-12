package com.pratice;

import java.util.*;

public class Stringcount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s;
		s=sc.nextLine();
		strcount(s);
	}

	public static void strcount(String s) 
	{
		Map<Character,Integer>map=new HashMap<>();
		int max=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);int n;
			if(map.containsKey(c))
			{
				if(max<=map.size())
				{
					max=map.size();
					
				}
				 n=map.get(c);
				for(int j=n;j>=-1;j--)
				{
					map.remove(n);
				}
				map.put(c,i);
			}
			else
			{
				map.put(c, i);
				if(max<=map.size())
				{
					max=map.size();
				}
			}
		}
		
		System.out.println(max+""+map);
	}
}
