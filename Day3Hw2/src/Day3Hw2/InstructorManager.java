package Day3Hw2;

public class InstructorManager {

	public void giveCourse(Instructor instructor) {
		System.out.println("Instructor "+ instructor.getFirstName()+" "+ instructor.getLastName()+ " gives a course named "+instructor.getGivenCourse()+"...");
	}
}
