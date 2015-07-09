package whileLoop;
/*
 * @ Date : 2015.07.09
 * @ Author : Chae S W
 * @ Story : while loop 문법2
 */
public class whileLoopDemo2_Main {
	public static void main(String[] args) {
		int idx = 0;
		while (true) {	// 무한루프 사용 선언
			idx++;
			System.out.print(idx + "\t");
			// 아래 구문이 없으면 무한루프
			if (idx == 10) {
				break;
			}
		}
	}
}
// 이게 좋은코딩