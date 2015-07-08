package hello;
/*
 * @ Date : 2015.07.07
 * @ Author : Chae S W
 * @ Story : Hello Java
 *
 */
public class HelloJava {
	/*
	 * 자바의 계층구조
	 * 프로젝트 > 패키지 > 클래스 > 멤버(멤버필드, 멤버메소드)
	 * 콘솔에 실행시키는 단축키 : CTRL + F11
	 * 콘솔에 로딩시키는 메소드 : main() - 클래스에 단 하나만 존재함. (최종으로 실행되는 메소드)
	 */
	public static void main(String[] args) {
		/*
		 * 자바에서 메소드는 엑셀에서 함수와 같은 기능을 한다.
		 * 하지만 차이점으로 함수는 상위 개념이 없고, 자바는 메소드 상위에 클래스가 존재한다는 점이다. 
		 */
		// sysout 은 출력단축키로 main()메소드 안에서만 작동한다.
		System.out.println("헬로우 자바");
	}
}