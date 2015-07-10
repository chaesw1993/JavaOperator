package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : if-else 예제 해설
 */
public class CalcAvg2 {
	public static void main(String[] args) {
		
		// 선언부
		Scanner scanner = new Scanner(System.in);
		String name = "", msg = "";
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0;		// 지역변수 초기화는 필수임
		
		System.out.print("학생 이름을 입력하세요 : ");
		name = scanner.next();
		System.out.print("국어성적을 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어성적을 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학성적을 입력하세요 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total / 3;
		
		// 연산부
		if(avg >= 90) {
			msg = "장학생";
		} else if((avg >= 70) && (avg < 90)) {
			msg = "합격";
		} else if(avg < 70){
			msg = "불합격";
		} else{
			System.out.println("다시 입력해주십시오.");
		}
		
		// 출력부
		System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
		System.out.println("--------------------------------------------------------------");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);
	}
}
