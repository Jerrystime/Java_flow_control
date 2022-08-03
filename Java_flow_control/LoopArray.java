
public class LoopArray {

	public static void main(String[] args) {

		/*
		 *	<li>egoing</li> 
		 *	<li>jinhyuk</li>
		 *	<li>yubin</li>
		 */
		
		String[] users = new String[3];	// 배열을 선언하고, 세 자리의 String 배열을 할당한다.
		users[0] = "egoing";	// 첫 번째 인덱스 값 할당
		users[1] = "jinhyuk";	// 두 번째 인덱스 값 할당
		users[2] = "yubin";	// 세 번째 인덱스 값 할당
		
		for (int i = 0; i < users.length; i++) {	// for문과 배열이 합쳐서 사용.
			System.out.println(users[i] + ",");
		}
		
	}

}
