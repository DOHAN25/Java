package com.stringbuffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Stringbuffer {
	// String 클래스는 한번 생성되면 그 값을 읽기만 할 수 있고, 변경할 수 없다.
	/*
	 * 하지만 StringBuffer클래스의 인스턴스는 그 값을 변경할 수도 있고,
	 * 추가할 수도 있다.
	 * 이를 위해 StringBuffer 클래스는 내부적으로 버퍼라는 독립된 공간을 가진다.
	 * 버퍼 크기는 기본값으로 16개의 문자를 저장할 수 있는 크기이며, 생성자를 통해
	 * 크기를 지정할 수 있다.
	 * 
	 * append() 메소드 : 인수로 전달된 값을 문자열로 변환 후 해당 문자열의 마지막에 추가 
	 * capacity() 메소드 : StringBuffer 인스턴스의 현재 버퍼 크기를 반환한다.
	 * delet() 메소드 : 전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 제거한다.
	 * insert() 메소드 : 인수로 전달된 값을 문자열로 변환 후 지정된 인덱스 위치에 추가한다.
	 * reverse() 메소드 : 해당 문자열의 인덱스를 역순으로 재배열함.
	 */
	
	public static void main(String[] args) throws IOException {
		/*
		StringBuffer str = new StringBuffer("Java");
		System.out.println("원본 문열: " + str);
		
		System.out.println(str.append("수업"));
		System.out.println("append() 메소드 후 문자열: " + str);
		
		
		StringBuffer str01 = new StringBuffer();
		StringBuffer str02 = new StringBuffer("Java");
		System.out.println(str01.capacity());
		System.out.println(str02.capacity()); // 항상 16 여유있게 만들어 진다.
		
		StringBuffer str03 = new StringBuffer("Java Oracle");
		System.out.println("원본 문자열: " + str03);
		
		System.out.println(str03.delete(4, 8));
		System.out.println(str03.deleteCharAt(1));
		System.out.println("deleteCharAt() 메소드 후 문자열: " + str03);
		
		
		StringBuffer str04 = new StringBuffer("Java 만세");
		System.out.println("원본 문자열: " + str04);
		
		System.out.println(str04.insert(4, "Script"));
		System.out.println("insert() 메소드 후 원본 문자열: " + str04);
		*/
		
		// 시스템 입력을 통해 문자열을 얻어내는 클래스
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(); // readLine() 리턴값을 String으로 고정 (다른 타입으로 입력을 받으려면 형변환 필수)
								  // 예외처리 반드시 해줘야 한다.
		
		StringTokenizer st = new StringTokenizer(s); // StringTokenizer 에 입력 문자열을 넣었다.
		int a = Integer.parseInt(st.nextToken()); // 첫번째 호출
		int b = Integer.parseInt(st.nextToken()); // 두번째 호출
		
		String array[] = s.split(" "); // 공백마다 데이터 끊어서 배열에 넣는다. 
		
		
		// BufferedWriter를 사용하여 출력 System.out.println("");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String out = "abcdefgh"; // 출력하고 싶은 문자열
		bw.write(out); // 출력하기
		bw.newLine();  // 줄바꿈
		bw.flush();    // 남아있는 데이터를 모두 출력시킴
		bw.close();    // 사용 후 닫아주기
		
		
	}
}
