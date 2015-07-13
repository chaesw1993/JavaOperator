package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : Chae S W
 * @ Story : int형 배열에서 입력값 중 최대값 구하기
 */
public class InputMax {
	public static void main(String[] args) {
		
		// for-loop으로 입력, 그리고 비교로직은 if
		
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		int max = 0;
		
		System.out.println("3개의 점수를 입력하시오 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
				if (arr[i] > max) {
					max = arr[i];
				}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}
}
