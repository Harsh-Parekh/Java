package com.hp;
import java.util.Scanner;
public class Binary
{
	public static void main(String args[])
	{
		Scanner o=new Scanner(System.in);
		int a,dp;
		String str="";
		System.out.print("Enter number :");
		a=o.nextInt();
		dp=a;
		while(a>0)
		{
			if(a%2==0)
			{
				str=str+" 0 ";
			}
			else
			{
				str=str+" 1 ";
			}
			a=a/2;
		}
		StringBuffer sb=new StringBuffer(str);
		System.out.print("Binary of "+dp+" is :"+sb.reverse());
	}
}
