package com.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		String[] input1=in.readLine().split(" ");
		
		int num=Integer.parseInt(input1[0]);
		int cutoff=Integer.parseInt(input1[1]);
		int outpout=0;
		int[] marks=new int[num];
		String[] input2=in.readLine().split(" ");
		
		for (int i=0;i<num;i++) {
			  
			  marks[i]=Integer.parseInt(input2[i]);
			  if (marks[i]<cutoff) { 
				  outpout++; }
			  
			  }
		System.out.println(outpout);
		

	}

}
