package array;
/*
 * @ Date : 2015.07.13
 * @ Author : Chae S W
 * @ Story : int형 배열 예제
 */
public class IntArrayDemo2 {
	public static void main(String[] args) {
		/*
		 	자바 배열의 특징
				1. 배열은 0부터 인덱스 번호가 시작된다.
				2. 배열의 크기 = 배열 요소의 갯수와 같다.
				3. 배열은 크기가 고정되어 있으며 요소를 추가할 수 없다.
				4. 배열은 한가지 타입만 지정할 수 있다.
		 */
		
		int[] arr = new int[3];	// 3은 요소의 갯수 = 배열의 크기 / 3이상의 크기를 가질 수 없다
		arr[0] = 1; // 배열 첫번째 칸에 숫자 1을 담는다.
		arr[1] = 2;
		arr[2] = 3;
//		arr[3] = 4;	// 이것은 지금은 에러표시를 하지 않지만 실행시키면 에러가 발생한다. (배열의 크기를 3으로 했기 때문)
		
		for (int i = 0; i < arr.length; i++) {
			// arr은 바로 직전에 선언한 객체[배열]이름
			// 배열객체이름.length 는 배열의 크기를 의미한다.
			System.out.print((i+1) + "\t");
		}
	}
}
