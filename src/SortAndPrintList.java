import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAndPrintList {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Tripti", "Bishnoi", 28), new Person("Ashish", "Upadhyay", 30),
				new Person("Deepika", "Bhardwaj", 32), new Person("Divya", "Mishra", 34),
				new Person("Aarush", "Bishnoi", 4));

		// Step1: Sort list by lastname
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.lastName.compareTo(o2.lastName);
			}
		});
		
		// Step2: Create a method that prints all elements in the list
		System.out.println("======Printing All=======");
		printAll(people);

		// Step3: Create a method that prints all elements that have age >= 30
		System.out.println("======Printing Conditionally=======");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.age>=30;
			}
		});
		
		System.out.println("======Printing Conditionally=======");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.lastName.endsWith("i") || p.lastName.startsWith("U");
			}
		});

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
				System.out.println(p.toString());
			}
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p.toString());
		}

	}

}

interface Condition{
	boolean test(Person p);
}
