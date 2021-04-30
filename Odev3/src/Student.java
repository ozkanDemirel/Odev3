
public class Student extends User{
	
	
	private String studentNumber;
	
	

	public Student() {
		super();
	}

	public Student(String firstName, String lastName, String course, String studentNumber) {
		super(firstName, lastName, course);
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	

	

	

	
	
}
