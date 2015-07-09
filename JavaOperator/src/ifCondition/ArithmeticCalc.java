package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : 사칙연산 계산 프로그램
 */
public class ArithmeticCalc {
	/*
	 	사칙연산 계산기(덧셈, 뺄셈, 곱셈, 나눗셈[몫 : ?, 나머지 : ?])
	 	사칙연산 기호도 입력 받습니다. +, -, *, /
	 	- 출력결과
	 		=== 심플 계산기 ===
	 		5 X 5 = 25
	 		5 + 5 = 10
	 		6 ÷ 5 = 몫 : 1, 나머지 : 1
	 		5 - 6 = -1
	*/
			
	public void simpleCalc(){
		
		// 선언부
		Scanner scanner = new Scanner(System.in);
		String arithmetic = "", temp = "";
		int a=0, b=0, result=0, nmg=0;
		
		System.out.print("첫번째 수 : ");
		a = scanner.nextInt();
		System.out.print("연산 기호 : ");
		arithmetic = scanner.next();
		// .nextLine은 긴문장을 받을때 쓴다.
		System.out.print("두번째 수 : ");
		b = scanner.nextInt();
						
		// 연산부
		if(arithmetic.equals("+")){
			temp = " + ";
			result = a + b;
		} else if(arithmetic.equals("-")){
			temp = " - ";
			result = a - b;
		} else if(arithmetic.equals("*")){
			temp = " X ";
			result = a * b;
		} else if(arithmetic.equals("/")){
			temp = " ÷ ";
			result = (a / b);
			nmg = a % b;
		} else
			System.out.println("다시 입력하세요.");
		
		// 출력부
		System.out.println("=== 심플 계산기 ===");
		if(arithmetic.equals("/")){
			if(nmg != 0){	
				System.out.println(a + temp + b + " = " + "몫 : " + result + ", 나머지 : " + nmg);
			} else if(nmg == 0){
				System.out.println(a + temp + b + " = " + result);
			}
		} else{
		System.out.println(a + temp + b + " = " + result);		
		}
	}
}
