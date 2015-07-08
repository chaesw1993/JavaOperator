package datatype;
/*
 * @ Date : 2015.07.07
 * @ Author : Chae S W
 * @ Story : 데이터 타입에 대한 문법
 */
public class DataType { // 낙타(카멜)표기법
/*
	1. 데이터 타입이란?
 		- 메모리를 생성하기 위한 도구
		- 메모리의 크기와 메모리의 형태를 지정하기 위한 도구
	2. 메모리를 얻고 사용하는 방법
		- 메모리 타입을 설정
		- 데이터 타입에 맞는 변수 선언
		- 변수에 값 할당
 */
	public static void main(StringDemo[] args) {
		// 데이터 타입 + 변수 형태
		byte bt;	// 정수형 8비트
		short s;	// 정수형 16비트
		int a;		// int는 정수형 숫자 32비트
		long lo;	// 정수형 64비트
		float f;	// float는 실수형 숫자
		double d;	// double은 실수형 숫자(무한대의 개념)
		char c;		// char는 알파벳
		boolean b;	// true / false를 나타낼때
		
		int a2;
		a2 = 5;		// int형 변수 a2에 숫자 5를 할당한다.
		int a3 = 5;
		System.out.println(a3);
	}
}
