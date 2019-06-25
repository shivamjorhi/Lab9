package com.cg;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Excercise2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
        	System.out.println("Enter data at "+i+" location");
        	arr[i]=sc.next().charAt(0);
        }
        System.out.println(countCharacter(arr));

	}

	public static HashMap<Character, Integer> countCharacter(char[] arr) {
		HashMap<Character,Integer> m=new HashMap<>();
		 for(int i=0;i<arr.length;i++)
		 {   int c=0;
			 for(int j=0;j<arr.length;j++)
			 { 
			 if(arr[i]==arr[j])
			 {
				 c++;
				 i=j;
			 }}
			 m.put(arr[i],c);
		 
		 	}
	  return m;
	  }
	
	

}
