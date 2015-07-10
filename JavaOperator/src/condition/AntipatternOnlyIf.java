package condition;
/*
 * @ Date : 2015.07.08
 * @ Author : Chae S W
 * @ Story : if 만 있는 구문에 대한 문
 */
public class AntipatternOnlyIf {
	public static void main(String[] args) {
		/*
		 	구문(statement)
		 	Java 연산식에서 3가지 종류의 구문으로 나뉜다.
		 		1. 조건문
		 			- if, if-else, switch
		 		2. 반복문
		 			- for, while, do-while
		 		3. 기타구문
		 			- continue, break, return
		*/
		int x = 1, y = 2;	// 지변 초기화
		if (x == y) {	// if문의 조건식 = condition
						// 숫자값의 비교연산자 ==
			System.out.println("숫자 x와 y의 값은 같다.");			
		}
		if (x != y) {	// !는 부정(not)
			System.out.println("숫자 x와 y의 값은 다르다.");
		}
		if (x > y) {
			System.out.println("숫자 x는 y보다 크다.");
		}
		if (x < y) {
			System.out.println("숫자 x는 y보다 작다.");
		}
		if (x >= y) {
			System.out.println("숫자 x는 y보다 크거나 같다.");
		}
		if (x <= y) {
			System.out.println("숫자 x는 y보다 작거나 같다.");
		}
	}
}
// 이런식의 코딩은 좋지않음.
/* 
 * 한 구문은 반드시 하나의 결과만을 리턴하게끔 코딩되어야 한다. 
 * 따라서 only if문을 코딩할때는 개발자가 단 한가지 케이스만 출력할 것이라는 확신이 있을때 다룬다.
 */