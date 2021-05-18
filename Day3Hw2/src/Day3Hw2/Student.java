package Day3Hw2;

public class Student extends User{

	private String takenCourse;

	public Student(int id, String firstName, String lastName, String email, String takenCourse) {
		super(id, firstName, lastName, email);
		this.takenCourse = takenCourse;
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}
	
	
}
