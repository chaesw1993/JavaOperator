package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.10
 * @ Author : Chae S W
 * @ Story : switch 예제(성별 판별)
 */
public class ManOrWoman {
	public void ssn() {
		/*
		 	ssn의 체계
		 	1,3 남자 / 2,4 여자 / 5 외국인
		*/
		Scanner scanner = new Scanner(System.in);
		String ssn = "", msg = "";
		
		System.out.println("주민번호를 입력하세요.(900101-1234567)");
		ssn = scanner.next();
		char ch = ssn.charAt(7);	// 900101-'1'234567 => ssn에 들어가있는 문자 7번째를 가지고와서 ch에 저장
									// 0123456 7 번째
					// charAt(n) 이 메소드는 0부터 시작해서 n번째 문자 하나만 출력. / 출력결과를 프로그래밍에서는 리턴값이라고 한다.
		
		switch (ch) {
		case '1':
		case '3':
			msg = "남자";
			break;
		case '2':
		case '4':
			msg = "여자";
			break;
		case '5':
			msg = "외국인";
			break;
		default:
			System.out.println("잘못입력한 값입니다.");
			break;
		}
		System.out.println(msg + "입니다.");
	}
}
