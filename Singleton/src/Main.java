

public class Main {

	public static void main(String[] args) {
		User user1 = User.getUser();
		System.out.println(user1);
		
		User.getUser().setName("Titino");
		User.getUser().setAge(30);
		User user2 = User.getUser();
		System.out.println(user2);

	}
}
