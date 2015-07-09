package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : if-else 예제
 */
public class CalcAvg_Me {
	public static void main(String[] args) {
		/*
		 	학생 	국어 	영어 	수학	  총점 	평균	 합격여부
		 	-----------------------------------------------
		 	홍길동 	90 		90 		90	  270 	90     장학생
		 	
		 	평균이 90이상이면 장학생
		 	평균이 70점이상, 90점 미만이면 합격
		 	평균이 70점 미만이면 불합격
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int kor=0, eng=0, math=0, total=0, avg=0;
		String name = null;
		
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
		
		System.out.print("학생\t국어\t영어\t수학\t총점\t평균\t합격여부"
						+ "\n----------------------------------------------------\n"
						+ "("+name+")\t("+kor+")\t("+eng+")\t("+math+")\t("+total+")\t("+avg+")\t");
		
		if(avg >= 90){
			System.out.println("(장학생)");
		} else if(70 <= avg && avg < 90){
			System.out.println("(합격)");
		} else if(avg < 70){
			System.out.println("(불합격)");
		} else{
			System.out.println("다시 입력해주십시오.");
		}
	}
}
// String 변수를 선언하여 그것을 if-else부분에서 처리..