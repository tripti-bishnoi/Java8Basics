
public class Person {

	String firstName;
	String lastName;
	int age;
	
	public Person(String fname, String lname, int age) {
		this.firstName = fname;
		this.lastName = lname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
