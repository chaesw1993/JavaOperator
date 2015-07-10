package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : Chae S W
 * @ Story : if 예제
 */
public class IfNumber {
	public static void main(String[] args) {
		/*
			학생 세명의 점수를 입력받아서 1등을 출력
			결과) 1등은 98점 입니다.
		*/
		Scanner scanner = new Scanner(System.in);
		
		int score1=0, score2=0, score3=0, temp=0;
		
		System.out.print("학생1의 점수를 입력하세요 : ");
		score1 = scanner.nextInt();
		System.out.print("학생2의 점수를 입력하세요 : ");
		score2 = scanner.nextInt();
		System.out.print("학생3의 점수를 입력하세요 : ");
		score3 = scanner.nextInt();
		
		/*
		 	조건식을 따져서 결과를 가정하지 말고, 결과를 상정한 다음 거기에 맞는 조건식을 설정하기.
		*/
		
		if (score1 > score2) {
			temp = score1;
		} else {
			temp = score2;
		}
		if (temp > score3) {
			// temp = temp;
		} else if(temp == score3){
			// temp = temp;
			System.out.println("1등 동점자가 존재합니다.");
		} else {
			temp = score3;
		}
		
		System.out.println("1등은 " + temp + "점 입니다.");
	}
}
