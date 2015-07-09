package whileLoop;
/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : while loop 문법
 */
public class WhileLoopDemo_Main {
	/*
	 	loop : 원단어 뜻은 순환의 의미
	 	인덱스 값을 통해 순환 횟수를 설정하고 limit 값을 통해 마감인덱스까지만 반복한다.
	 	
	 	while loop은 limit 값을 알 수 있는 상황과 없는 상황 두 가지 방식으로 사용된다.
	*/
	public static void main(String[] args) {
		// limit 값이 설정 된 경우
		int idx = 1;
		while (idx < 11) {
			System.out.print(idx + "\t");
			idx++;	// 단항 연산식으로 기본 idx값에 반복때마다 1씩 증가시킴
		}
	}
}
