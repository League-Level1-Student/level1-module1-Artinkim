public class Runner_Intro_getter_and_setters {
	public static void main(String[] args) {
		Person one = new Person();
		Person two = new Person();
		Person three = new Person();

		one.getName("one");
		one.getsuperpower("fly");
		System.out.println(one.toString());

		two.getName("two");
		two.getsuperpower("jump");
		System.out.println(two.toString());

		three.getName("three");
		three.getsuperpower("run");
		System.out.println(three.toString());

	}

}
