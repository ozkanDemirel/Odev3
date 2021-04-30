
public class InstructorManager extends UserManager {

	

	public void addCourse(User user) {

			System.out.println(user.getCourse() + " dersi eðitmenin eðitim verdiði kurslara eklendi");

	}
	
	public void teach(User user) {
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" bu kursta "+user.getCourse()+" eðitimi veriyor");
		
	}

}
