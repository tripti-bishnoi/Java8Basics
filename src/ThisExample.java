import java.util.function.Consumer;

public class ThisExample {

	public static void main(String[] args) {
		ThisExample thisExample = new ThisExample();

		// thisExample.doSomething(10, (i) -> {
		// System.out.println(i);
		// System.out.println(this); //Cant do this
		// });

		thisExample.execute();
	}

	private void execute() {
		doSomething(10, (i) -> {
			System.out.println(i);
			System.out.println(this);
		});

	}

	public void doSomething(int i, Consumer<Integer> p) {
		p.accept(i);
	}

}
