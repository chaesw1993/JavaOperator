package ifCondition;
/*
 * @ Date : 2015.07.08
 * @ Author : Chae S W
 * @ Story : if-else 구문에 대한 문법
 */
public class IfElse {
	public static void main(String[] args) {
		int x = 1, y = 2;	// 지변 초기화
		if ((x == 1) && (y == 1)) {	// && 엔퍼센트라 읽고 and 연산자
			System.out.println("x는 1이면서 y는 1입니다.");
		} else if ((x == 2) || (y==1)) {	// || 컬럼으로 읽으며 or 연산자
			System.out.println("x는 1이거나 y는 1입니다.");
		} else{
			System.out.println("해당 사항이 없습니다.");
		}
	}
}
