import java.util.Arrays;
import java.util.List;

public class SortAndPrintListCollectionIteration {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Tripti", "Bishnoi", 28), new Person("Ashish", "Upadhyay", 30),
				new Person("Deepika", "Bhardwaj", 32), new Person("Divya", "Mishra", 34),
				new Person("Aarush", "Bishnoi", 4));

		people.forEach(System.out::println);

	}

}
