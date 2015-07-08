package datatype;

import java.util.Scanner;
/*
 * @ Date : 2015.07.07
 * @ Author : Chae S W
 * @ Story : 
 */
public class InputTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 선언부, 초기화 영역
		// int kor = 0, eng = 0, math = 0, total = 0; -- 디폴트 값 선언 : 지역변수 초기화
		// int kor, eng, math, total; -- 인스턴스 변수 선언법
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;
		
		// 연산부, 프로세싱		
		System.out.println("국어점수를 입력하세요.");
		kor = scanner.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scanner.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		System.out.println("총점 : " + total);
		avg = total / 3;
		System.out.println("평균 : " + avg);
	}
}
