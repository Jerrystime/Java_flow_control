
public class IfApp {

	public static void main(String[] args) {

		System.out.println("a");
		if (false) {	// if 뒤에 괄호 안에는 boolean 데이터 타입만 들어갈 수 있다.
			// 괄호 안(Condition)이 true이면 중괄호 안에 if문이 실행된다
			System.out.println(1);
		} else {	// 괄호 안(Condition)이 false이면 else문이 실행된다.
			if (true) {	// 조건문 안에는 또 다른 조건문이 들어갈 수 있다.
				System.out.println(2);
			} else {
				System.out.println(3);
			}
		}
		
		// 조건문 안에 조건문이 들어간 형태는 복잡하기 때문에 아래 코드처럼 간결하게 바꿀 수 있다.
		if (false) {
			System.out.println(1);
		} else if (true) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		System.out.println("b");
		
	}

}
