package condition;
/*
 * @ Date : 2015.07.08
 * @ Author : Chae S W
 * @ Story : if 만 있는 구문에 대한 문
 */
public class OnlyIf {
	public static void main(String[] args) {		// 이 괄호이름은 브레이스
		int x = 1, y = 2;	// 지변 초기화
		if ((x == 1) && (y == 1)) {	// && 엔퍼센트라 읽고 and 연산자
			System.out.println("x는 1이면서 y는 1입니다.");
		}
		if ((x == 1) || (y==1)) {	// || 컬럼으로 읽으며 or 연산자
			System.out.println("x는 1이거나 y는 1입니다.");
		}
	}
}
