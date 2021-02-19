package com.kh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answer {

	public static void main(String[] args) {
		
		int[] arr = {2,1,3,4,1};
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = arr.length-1; j > 0; j--) {
				if(i != j) {
				list.add(arr[i] + arr[j]);
				}
			}
			
		}
		
		int[] arrx = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			arrx[i] = list.get(i);
		}
		
		
		Arrays.sort(arrx);
		
		List<Integer> answer = new ArrayList<Integer>();
		
		for(int i = 0; i < arrx.length; i++) {
			if(!answer.contains(arrx[i])) {
				answer.add(arrx[i]);
			}
		}
		
		System.out.println(answer);	
	}
}




