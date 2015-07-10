package loop;
/*
 * @ Date : 2015.07.10
 * @ Author : Chae S W
 * @ Story : for loop 문법
 */
public class ForLoop {
	public static void main(String[] args) {
		/*
			for loop의 장점
			1. 초기화, 한계값(limit), 증감값 설정을 한 condition 내부에서 일괄 설정하므로
			   가독성이 좋고 코딩이 빠르게 진행된다. 따라서, while loop보다 권장한다.
		
		*/
		for (int i = 0;		// 지변 i 초기화, if문의 condition과 동일 기능
				i < 10;		// 지변 i의 한계값(limit) 설정
				i++) {		// 1씩 증가
			System.out.println();	// 출력부
		}
	}
}
