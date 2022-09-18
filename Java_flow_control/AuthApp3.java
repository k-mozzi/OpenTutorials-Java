
public class AuthApp3 {

	public static void main(String[] args) {

//		String[] users = { "gyeongmo", "jaewhee", "donghyeon" };
		String[][] users = {
				{"gyeongmo", "1111"},
				{"jaewhee","2222"},
				{"donghyeon", "3333"}
		};
		// 대괄호를 두 개 치면 배열 안에 또다른 배열을 만들 수 있다. 즉, 배열의 원솟값이 배열이다.

		String inputId = args[0];
		String inputPass = args[1];

		boolean isLogined = false;
		for (int i = 0; i < users.length; i++) {
			String[] current = users[i];
			if (
					current[0].equals(inputId) && 
					current[1].equals(inputPass)
			) {
				isLogined = true;
				break;
			}
		}
		System.out.println("Hi.");
		if (isLogined) {
			System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
	}

}
