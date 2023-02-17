
public class StudentTest {

	public static void main(String[] args) {
		System.out.println("begin main...");
		Person p = new Person("Ram", 'M', 22);
		

		System.out.println("------------");
		Student s = new Student("Raj", 'M', 20, 19227, "Amrita", "Mechanical", 96.00f, 'A');
		System.out.println("------------");
		Employee e = new Employee("Rag", 'M', 21, 19229, "Amrita", "Mechanical", 97.00f, 'A',3,"Dassault");
		System.out.println("------------");

		// TODO Auto-generated method stub

	}

}

class Person {
	int age;
	char gender;
	String name;

	Person() {

		System.out.println("Person Constror...");

	}

	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
	}

}

class Student extends Person {
	int rollNumber;
	String collegeName;
	String stream;
	float totalMarks;
	char grade;

	Student() {
		System.out.println("Student Constructor...");

	}

	public Student(String name, char gender, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade) {
		super(name, gender, age);
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.stream = stream;
		this.totalMarks = totalMarks;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", gender=" + gender + ", name=" + name + ", rollNumber=" + rollNumber
				+ ", collegeName=" + collegeName + ", stream=" + stream + ", totalMarks=" + totalMarks + ", grade="
				+ grade + "]";
	}

}

class Employee extends Student {
	int NoOfYears;
	String CompanyName;
	Employee() {
		System.out.println("Employee Constructor...");
	}
	public Employee(String name, char gender, int age, int rollNumber, String collegeName, String stream,
			float totalMarks, char grade, int noOfYears, String companyName) {
		super(name, gender, age, rollNumber, collegeName, stream, totalMarks, grade);
		NoOfYears = noOfYears;
		CompanyName = companyName;
	}
	@Override
	public String toString() {
		return "Employee [rollNumber=" + rollNumber + ", collegeName=" + collegeName + ", stream=" + stream
				+ ", totalMarks=" + totalMarks + ", grade=" + grade + ", age=" + age + ", gender=" + gender + ", name="
				+ name + ", NoOfYears=" + NoOfYears + ", CompanyName=" + CompanyName + "]";
	}
	
}
