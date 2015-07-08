package operator;
/*
  @ Date : 2015.07.08
  @ Author : Chae S W
  @ Story : 단항 연산자 문법
*/
public class Unary {
	public static void main(String[] args) {
		/*
			단항연산자
			i++(후위연산자) 또는 ++i(전위연산자)
		*/
		int i = 0, j = 0, x = 0, y = 0;	// 지역변수는 디폴트값으로 초기화
		i = 5; x = 5;

		// 후위형은 변수값을 읽어온 후 연산한다.
		j = i++;	// 디폴트 값을 가지고있다. 
		System.out.println("j의 값 :\t" + j);
		
		// 전위형은 x으 ㅣ값을 증가시키고 연산한다.
		// i = i + 1;
		y = ++x;
		System.out.println("y의 값 :\t" + y);
	}
}
