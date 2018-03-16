import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

public class SortAndPrintListStreams {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Tripti", "Bishnoi", 28), new Person("Ashish", "Upadhyay", 30),
				new Person("Deepika", "Bhardwaj", 32), new Person("Divya", "Mishra", 34),
				new Person("Aarush", "Bishnoi", 4));

		people.stream() //parallelStream()
		.filter(p -> p.lastName == "Bishnoi")
		.forEach(p -> System.out.println(p.firstName));
		
//		people.stream()
//				.filter(p -> p.lastName == "Bishnoi").toArray(IntFunction<int[]> func);
		

	}

}
