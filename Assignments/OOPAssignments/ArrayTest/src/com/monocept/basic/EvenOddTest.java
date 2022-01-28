package com.monocept.basic;

import java.util.Scanner;

class EvenOddTest {
	public static int[] getOddNosTill(int N ) {
		int []arr = new int[N/2+1];
		int count=1;
		for(int i=0;i<N/2+1;i++) {
			arr[i]=count;
			count+=2;
		}
		return arr;
	}
	public static int[] getEvenNosTill(int N) {
		int []arr = new int[N/2];
		int count=2;
		for(int i=0;i<N/2;i++) {
			arr[i]=count;
			count+=2;
		}
		return arr;
	}
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		}
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int N = sc.nextInt();
		int []nos = getOddNosTill(N);
		System.out.println("printing odd number");
		display(nos);
		nos = getEvenNosTill(N);
		System.out.println("printing even number ");
		display(nos);
	}
 }
	

