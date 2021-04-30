
public class StudentManager extends UserManager {

	public void addCourse(User user) {

		System.out.println(user.getCourse() + " dersi öðrencinin eðitim aldýðý kurslara eklendi");

	}

	public void learn(User user) {

		System.out.println(
				user.getFirstName() + " " + user.getLastName() + " bu kursta " + user.getCourse() + " eðitimi alýyor");

	}

}
