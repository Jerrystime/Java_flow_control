
public class EqualsApp {

	public static void main(String[] args) {
		
		// boolean byte short int long float char double = 원시 데이터 타입
		// String Array Date File = 참조 데이터 타입
		
		int p1 = 1;	// 원시 데이터 타입을 가진 변수가 어떠한 값을 할당하면 그 값을 메모리에 저장한다.
		int p2 = 1;	// 다른 원시 데이터 타입을 가진 변수가 할당한 값이 메모리에 저장된 값과 같다면 이미 저장된 메모리 값을 공유한다.
		
		String o1 = "Java";	// 참조 데이터 타입을 가진 변수가 어떠한 값을 할당하면 그 값을 메모리에 저장한다.
		String o2 = new String("Java");	// 다른 참조 데이터 타입을 가진 변수가 할당한 값이 메모리에 이미 저장된 값과 같더라도 다른 메모리 공간에 저장한다.
		// 문자열과 같은 참조 데이터형의 값을 비교할 때에는 `==`와 같은 비교 연산자가 아닌 equals()라는 메소드를 사용해서 비교해야 된다.
		
	}

}
