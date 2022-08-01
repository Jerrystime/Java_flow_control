
public class BooleanApp {

	public static void main(String[] args) {
		
		System.out.println("One");
		System.out.println(1);
		
		// Boolean 데이터 타입에는 true, false 두 가지 밖에 없다.
		System.out.println(true);
		System.out.println(false);
		
		String foo = "Hello world";
//		String true = "Hello world";	// true, false는 Boolean이라고 약속이 되어있기 때문에 변수의 이름으로 사용할 수 없다.
		// 이러한 단어들을 reserved word라고 한다.
		
		System.out.println(foo.contains("world"));	// contains는 해당 변수에 ()안에 단어가 들어있는지 확인하는 메소드이다.
		System.out.println(foo.contains("egoing"));
		
		// 참, 거짓 즉, true랑 false를 값을 나타내는 데이터 타입이 Boolean 데이터 타입이다.
		
	}

}
