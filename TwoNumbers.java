package com.kh;

public class TwoNumbers {

	public static void main(String[] args) {
		
		//solution(3,5);
		solution(3,3);
		//solution(5,3);
	}	
	
	
	
	public static void solution(int a, int b) {
		int answer = 0;
		boolean stop = false;
		if(a < b) {
		for(int i = a; i <= b; i++) {
			answer+=i;
		}
		} else {
			for(int j = a; j >= b; j--) {
				answer+=j;
			}
		}
		System.out.println(answer);
	}
}
	


