
public class LogicalOperatorApp {

	public static void main(String[] args) {

		System.out.println(1 == 1);
		
		// AND 연산자 : 좌항과 우항 둘 다 true일 경우, true를 반환한다.
		System.out.println(true && true);	// true
		System.out.println(true && false);	// false
		System.out.println(false && true);	// false
		System.out.println(false && false);	// false
		
		// OR 연산자 : 좌항과 우항 둘 중 하나라도 true일 경우, true를 반환한다.
		System.out.println(true || true);	// true
		System.out.println(true || false);	// true
		System.out.println(false || true);	// true
		System.out.println(false || false);	// false
		
		// NOT 연산자 : 반환되는 boolean의 반대를 반환한다.
		System.out.println(!true);	// false
		System.out.println(!false);	// true
		
	}

}
