package zadaci_17_08_2015;

/**
 * class witch serves as test for Person class and classes that exteds Person
 * class
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// creating and printing out person object
		Person p1 = new Person("John", "Some street", "123456",
				"someemail@gmail.com");
		System.out.println(p1);
		// creating and printing out student object
		Student s1 = new Student("Bob", "Some street", "12345",
				"somemail@gmail.com", 0);
		System.out.println(s1);
		// creating and printing out employee object
		Employee e1 = new Employee("Bill", "Aslo some street", "123556",
				"mail@gmail.com", 123, 5000);
		System.out.println(e1);
		// creating and printing out faculty object
		Faculty f1 = new Faculty("Steve", "New Street", "213415",
				"email@gmail.com", 124, 4500, 40, "Some rank");
		System.out.println(f1);
		// creating and printing out staff object
		Staff staff1 = new Staff("Peter", "street", "132141",
				"newmail@hotmail.com", 25, 4500, "Some title");
		System.out.println(staff1);

	}

}
