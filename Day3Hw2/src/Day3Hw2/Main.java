package Day3Hw2;
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(12345,"Ay�a","Damar","ayca.damar@gmail.com","Java");
		
		Instructor instructor = new Instructor(78910, "Engin","Demiro�","email.com", "Java","E�itmen");
		
		User[] users = {student,instructor};
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeCourse(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveCourse(instructor);
	}

}
