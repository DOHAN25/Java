package com.kh;

import java.util.ArrayList;


public class HateSameNum {
	public static void main(String[] args) {
	
		int[] arr = {1,1,3,3,0,1,1};
		
		int[] answer = solution(arr);
		System.out.print("[");
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i]);
			if(i < answer.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}

	// 배열을 받아 정렬 후 같은 값을 빼고 리턴해주는 메소드
	public static int[] solution(int[] arr) {
		
		// 배열은 크기를 지정해놓아야 하기 때문에 ArrayList에 정렬값들을 넣어줄 것이다.
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		// 제시된 배열 크기만큼 반복 인덱스 i+1을 하면서 비교를 해야 하기 때문에 -1
		for(int i = 0; i < arr.length-1; i++) {
			// 배열의 첫 인덱스부터 다음 인덱스와 비교하여 다르면 list에 저장
			if(arr[i] != arr[i+1]) {
				list.add(arr[i]);
				// 배열의 가장 마지막 값은 다음값이 없기 대문에 무조건 저장.
			} else if(i == arr.length-2) {
				list.add(arr[i+1]);
			}
		}
		// Arraylist 다시 배열로 변환
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		
		return answer;
		
	}
}
