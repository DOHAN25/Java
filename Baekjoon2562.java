package com.kh;

import java.util.ArrayList;

public class Baekjoon2562 {
	
	public static void main(String[] args) {

		int[] x = {3, 29, 38, 12, 57, 74, 40, 85, 61};
		
		int count = 0;
		int max = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] > max) {
				max = x[i];
				count = (i + 1);
			}
		}
		

		System.out.println("최대값 : " + max + " 위치한 순서: " + count + "번째");
		
	}
	
	
}
