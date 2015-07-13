package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Chae S W
 * @ Story : int형 배열 입력 예제
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];		// 3개 숫자 저장 공간
		int total=0, avg=0;
		
		//배열에 값을 입력하라고 하면 무조건 for CTRL+SPACE
		
		System.out.println("3개의 점수를 입력하세요.");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();		// i번째를 돌면서 scanner.nextInt를 함
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 값 : " + arr[i] + "\t");
			total += arr[i];
		}
		avg = total / arr.length;
		
		System.out.println("\n총점 : " + total + "\n평균 : " + avg);
	}
}
