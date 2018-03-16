import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortAndPrintListMethodReference {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Tripti", "Bishnoi", 28), new Person("Ashish", "Upadhyay", 30),
				new Person("Deepika", "Bhardwaj", 32), new Person("Divya", "Mishra", 34),
				new Person("Aarush", "Bishnoi", 4));

		// Step2: Create a method that prints all elements in the list
		System.out.println("======Printing All=======");
		//performConditionally(people, p -> true, p -> System.out.println(p));
		performConditionally(people, p -> true, System.out::println); // <INSTANCE>::<METHOD>

	}

	/*
	 * 1: passing the list of elements 2: condition to be checked 3: What to
	 * perform on the elements
	 */
	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
