package loop;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Chae S W
 * @ Story : for-loop + if 결합예제
 */
public class EvenOddSum {
	public void calc() {
		/*
			(1)부터 (10)까지의 (입력받은) 수 중에서 각각 짝수의 합과 홀수의 합을 분리하여 출력하시오.
		*/
		
		// 선언부
		Scanner scanner = new Scanner(System.in);
		
		int a=0, b=0, holSum=0, jjakSum=0;
		System.out.print("처음 시작 숫자를 입력하세요 : ");
		a = scanner.nextInt();
		System.out.print("마지막 숫자를 입력하세요 : ");
		b = scanner.nextInt();
				
		// 연산부
		for (int temp = a; temp <= b; temp++) {
			if(temp % 2 == 1){		// a와 b는 상수 // temp 인덱스 변수
				holSum += temp;
			} else
				jjakSum += temp;
		}
		
		// 출력부
		System.out.println(a + "부터 " + b + "까지의 정수 중에서\n" + 
		"홀수의 합은 " + holSum + "이고\n" + "짝수의 합은 " + jjakSum + "이다.");
	}
}
