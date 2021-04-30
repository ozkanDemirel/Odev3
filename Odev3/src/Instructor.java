
public class Instructor extends User{

	
	private String instructorNumber;
	
	
	public Instructor() {
		super();
	}

	public Instructor(String firstName, String lastName, String course, String instructorNumber) {
		super(firstName, lastName, course);
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	
	
	
	
	
	
	
	
	
}
