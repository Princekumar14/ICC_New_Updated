package OtherTasks;

import OtherTasks.a1.b1;

class a1{
	static void name() {
		System.out.println("Prince");
	}
	static class b1{

		static void name() {
			System.out.println("Princek at nested class");
		}
	}
}
public class nestedclass {
	public static void main(String[]args) {
		a1.name();
		b1.name();
	}

}
