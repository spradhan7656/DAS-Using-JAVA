package com.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Median 
{
	
	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) 
	    {
	    	List<Integer>arr=new ArrayList<>();
	        int size1=nums1.length;
	        int size2=nums2.length;
	        int size=size1>size2?size1:size2;
	        double mid,mid1;
	        double median = 0;
	        int j=0,k=0;
	        for(int i=0;i<size1+size2;i++)
	        {
	        	if(nums1[j]<nums2[k])
	        	{
	        		arr.add(nums1[j]);
	        		j++;
	        	}
	        	else
	        	{
	        		arr.add(nums2[k]);
	        		k++;
	        	}
	        }
	        System.out.println(arr);
	        if(arr.size()%2==0)
	        {
	        	mid=arr.get(arr.size()/2);
	        	mid1=arr.get(1+(arr.size()/2));
	        	median=(mid+mid1)/2;
	        	
	        }
	        else
	        {
	        	mid=arr.get(arr.size()/2);
	        }
	        return median;
	    }
	    public static void main(String[] args) 
	    {
	    	Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of 1array");
			int n1=sc.nextInt();
			System.out.println("enter the size of 2array");
			int n2=sc.nextInt();
			int nums1[]=new int[n1];
			int nums2[]=new int[n2];
			System.out.println("enter the 1 array element");
			for(int i=0;i<nums1.length;i++)
			{
				nums1[i]=sc.nextInt();
			}
			System.out.println("enter the 2 array element");
			for(int i=0;i<nums2.length;i++)
			{
				nums2[i]=sc.nextInt();
			}
			double mid=findMedianSortedArrays(nums1,nums2); 
			System.out.println(mid);
			
		}
	
}
