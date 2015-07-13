package loop;
/*
 * @ Date : 2015.07.13
 * @ Author : Chae S W
 * @ Story : for-loop을 활용한 1부터 10까지 합
 */
public class ForLoopSum {
	public static void main(String[] args) {
		int sum = 0;	// 누적되는 결과값을 출력하는 변수는 for-loop 바깥에 선언 및 초기화해야한다.
		
		// 현재 지변 초기화를 하지 않은 이유는 밑의 for-loop 내부에서 하고있기 때문이다.
		for (int i = 1; i <= 10; i++) {
			sum += i;	// i 값이 회전하면서 증가하는 값을 누적시키는 연산
//			sum = sum + i;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}
}
