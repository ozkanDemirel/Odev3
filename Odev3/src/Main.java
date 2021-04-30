
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setInstructorNumber("001");
		instructor.setCourse("C#");
		
		
		Student student = new Student();
		student.setFirstName("Özkan");
		student.setLastName("Demirel");
		student.setStudentNumber("006");
		student.setCourse("Java");
		System.out.println("************************************************************");
		UserManager userManager1 = new UserManager();
		userManager1.teach(instructor);
		userManager1.learn(student);
		System.out.println("************************************************************");
		
		UserManager userManager2 = new InstructorManager();
		userManager2.addCourse(instructor);
		userManager2.teach(instructor);
		System.out.println("************************************************************");
		StudentManager userManager3 = new StudentManager();
		userManager3.addCourse(student);
		userManager3.learn(student);
		System.out.println("************************************************************");
		
		
	}

}
