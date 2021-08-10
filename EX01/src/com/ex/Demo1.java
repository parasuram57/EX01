package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int cutoff=sc.nextInt();
		int outpout=0;
		int[] marks=new int[num];
		
		  for (int i=0;i<num;i++) {
		  
		  marks[i]=sc.nextInt(); 
		  if (marks[i]<cutoff) { 
			  outpout++; }
		  
		  } 
		
		System.out.println(outpout);
		

	}

}
