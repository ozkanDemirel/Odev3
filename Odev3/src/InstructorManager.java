
public class InstructorManager extends UserManager {

	

	public void addCourse(User user) {

			System.out.println(user.getCourse() + " dersi e�itmenin e�itim verdi�i kurslara eklendi");

	}
	
	public void teach(User user) {
		
		System.out.println(user.getFirstName()+" "+user.getLastName()+" bu kursta "+user.getCourse()+" e�itimi veriyor");
		
	}

}
