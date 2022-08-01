
public class AuthApp {

	public static void main(String[] args) {
			
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String InputPass = args[1];
		
		System.out.println("Hi.");
		
//		if (inputId == id)
//		if (inputId.equals(id)) {	// 문자열을 비교할 때에는 equals() 메소드를 사용해야 한다.
//			if (InputPass.equals(pass)) {
//				System.out.println("Master!");	// args 인자를 egoing으로 주었을 때
//			} else {
//				System.out.println("Wrong Password!");
//			}
//		} else {
//			System.out.println("Who are you?");	// args 인자를 egoing이 아닌 것을 주었을 때
//		}
		
		if (inputId.equals(id) && InputPass.equals(pass)) {	// 논리 연산자 AND를 활용해서 둘 다 true일 경우에 true가 되도록 한다.
			System.out.println("Master!");	// 둘 다 true일 경우
		} else {
			System.out.println("Who are you?");	// 둘 중 하나라도 false일 경우
		}
	}

}
