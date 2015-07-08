package operator;

import java.util.Scanner;

/*
 * @ Date : 2015.07.08
 * @ Author : Chae S W
 * @ Story : 입력받은 초를 시간 분 초로 환산하는 프로그램
 */
public class TimeSeperator {
	public static void main(String[] args) {
		
		// 프로그램에는 무조건 input이 존재해야하고 결과값 output이 있어야 함.
		
		// 변수의 선언
		Scanner scanner = new Scanner(System.in);
		int input = 0, sec = 0, min = 0, hour = 0;
		System.out.println("구하고자 하는 시간(초) 입력");
		input = scanner.nextInt();
		// 입력받은 초가 500이라고 한다면 500초를 60으로 나눈 나머지가 초
		// 위 연산에서 나온 몫을 다시 60으로 나눈 나머지가 분
		// 위 연산에서 나온 몫이 시간
		
		sec = input % 60;
		min = (input / 60) % 60;
		hour = (input / 60) / 60;
		
		System.out.println("입력하신 초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.");
	}
}
