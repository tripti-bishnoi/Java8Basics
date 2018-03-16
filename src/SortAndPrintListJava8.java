import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class SortAndPrintListJava8 {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Tripti", "Bishnoi", 28), new Person("Ashish", "Upadhyay", 30),
				new Person("Deepika", "Bhardwaj", 32), new Person("Divya", "Mishra", 34),
				new Person("Aarush", "Bishnoi", 4));

		// Step1: Sort list by lastname
		Collections.sort(people, (Person o1, Person o2) -> o1.lastName.compareTo(o2.lastName));

		// Step2: Create a method that prints all elements in the list
		System.out.println("======Printing All=======");
		performConditionally(people, p -> true, p -> System.out.println(p.toString()));

		// Step3: Create a method that prints all elements that have age >= 30
		System.out.println("======Printing Conditionally=======");
		performConditionally(people, p -> p.age >= 30, p -> System.out.println(p.age));

		System.out.println("======Printing Conditionally=======");
		performConditionally(people, p -> p.lastName.endsWith("i") || p.lastName.startsWith("U"),
				p -> System.out.println(p.lastName));

	}

	/*
	 * 1: passing the list of elements 2: condition to be checked 3: What to
	 * perform on the elements
	 */
	// using Predicate from java.util.function , its an out of the box interface
	// available in java 8
	// so that we dont have to create new interface
	// visit:
	// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
