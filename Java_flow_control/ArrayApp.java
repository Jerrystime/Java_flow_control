
public class ArrayApp {

	public static void main(String[] args) {

		// egoing, jinhyuk, yubin
//		String users = "egoing, jinhyuk, yubin";
		String[] users = new String[3];	// 배열을 선언하고, 세 자리의 String 배열을 할당한다.
		users[0] = "egoing";	// 첫 번째 인덱스 값 할당
		users[1] = "jinhyuk";	// 두 번째 인덱스 값 할당
		users[2] = "yubin";	// 세 번째 인덱스 값 할당
		
		System.out.println(users[1]);	// 두 번째 인덱스 값 출력
		System.out.println(users.length);	// users 배열의 길이 출력
		
		int[] scores = {10, 100, 100};	// 선언과 동시에 할당을 할 수 있다.
		System.out.println(scores[1]);
		System.out.println(scores.length);
		
	}

}
