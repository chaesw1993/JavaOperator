package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.08
 * @ Author : Chae S W
 * @ Story : 계산기
 */
public class Calculator {
	public static void main(String[] args) {
		/*
			스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오.
			예) 20 + 7 = 27
		*/
		
		// 선언부
		Scanner scanner = new Scanner(System.in);
		int x = 0, y = 0;	// 지역변수는 디폴트 값으로 초기화
		
		// 연산부
		System.out.println("두 숫자를 입력하십시오.");
		x = scanner.nextInt();		// next = 커서 다음 글자(숫자)를 변수에 할당하라.
		y = scanner.nextInt();
		
		// 출력영역
		System.out.println(x + " + " + y + " =\t" + (x + y));
		System.out.println(x + " - " + y + " =\t" + (x - y));
		System.out.println(x + " * " + y + " =\t" + (x * y));
		System.out.println(x + " / " + y + " =\t" + (x / y));
		System.out.println(x + " % " + y + " =\t" + (x % y));
		
		scanner.close();
	}
}
