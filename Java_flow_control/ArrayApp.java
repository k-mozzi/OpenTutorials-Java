
public class ArrayApp {

	public static void main(String[] args) {

		// 배열을 생성한 후 값 할
		String[] users = new String[3];
		users[0] = "gyeongmo";
		users[1] = "jaewhee";
		users[2] = "donghyeon";

		System.out.println(users[2]);
		System.out.println(users.length);

		// 배열을 생성하며 곧바로 값 할당
		int[] scores = { 10, 100, 100 };
		System.out.println(scores[1]);
		System.out.println(scores.length);
	}

}
