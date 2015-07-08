package variable;
/*
 * @ Date : 2015.07.07
 * @ Author : Chae S W
 * @ Story : 
 */
public class Total {
	public static void main(String[] args) {
		// 국어점수는 데이터 타입이 정수이다.
		// 변수명은 kor
		// 할당된 값은 80
		int kor = 60,  eng = 60, math = 60;
		// 같은 데이터 타입의 변수를 여러개 선언과 할당할때는 다음과 같이 한다.
		int total = 0;
		// 지역변수 초기화
		total = kor + eng + math;
		System.out.println("총점 : " + total);
		int avg;
		avg = total / 3;
		System.out.println("평균 : " + avg);
	}
}
