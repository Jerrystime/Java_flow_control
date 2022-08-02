import java.util.Iterator;

public class LoopApp {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println("=== while ===");
		int i = 0;
		while (i < 3) {	// while 옆 괄호(condition)에 조건을 넣어주고, 그 조건이 true일 경우 while문을 실행시킨다. false면 중괄호 다음 코드를 실행한다.
			System.out.println(2);
			System.out.println(3);
//			i = i + 1;
			i++; // 위의 코드와 같은 동작을 한다.
		}
			
		System.out.println("=== for ===");
		for (int j = 0; j < 3; j++) {	// for 옆 괄호에 첫번째에는 변수를 초기화해주고, 두번째에는 조건을, 세번째에는 증감 연산자를 넣어준다.
			System.out.println(2);		// 첫번째는 초기화이기 때문에 최초에 1회만 실행되고, 두번째에서 조건이 true이면 for문을 실행한다. 그 다음 증감 연산자를 실행하고 다시 조건을 확인한다. 이렇게 조건이 false가 나올 때까지 반복한다.
			System.out.println(3);
		}
		
		System.out.println(4);
		
	}

}
