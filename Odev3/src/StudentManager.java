
public class StudentManager extends UserManager {

	public void addCourse(User user) {

		System.out.println(user.getCourse() + " dersi ��rencinin e�itim ald��� kurslara eklendi");

	}

	public void learn(User user) {

		System.out.println(
				user.getFirstName() + " " + user.getLastName() + " bu kursta " + user.getCourse() + " e�itimi al�yor");

	}

}
