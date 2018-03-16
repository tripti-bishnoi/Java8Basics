import java.util.function.BiConsumer;

public class ExceptionHandlingJava8 {

	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 5, 6, 8 };
		int key = 0;

		process(someNumbers, key, (v, k) -> System.out.println(v + k));
//		process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

	}

//	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
//		return (v, k) -> {
//			try {
//				consumer.accept(v, k);
//			} catch (ArithmeticException e) {
//				System.out.println("ERROR: " + v);
//			}
//		};
//	}

	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int val : someNumbers) {
			consumer.accept(val, key);
		}
	}

}
