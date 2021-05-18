package Day3Hw2;

public class Instructor extends User{

	private String givenCourse;
	
	private String instructorDetail;
	
	public Instructor(int id, String firstName, String lastName, String email, String givenCourse,
			String instructorDetail) {
		super(id, firstName, lastName, email);
		this.givenCourse = givenCourse;
		this.instructorDetail = instructorDetail;
	}

	public String getGivenCourse() {
		return givenCourse;
	}

	public void setGivenCourse(String givenCourse) {
		this.givenCourse = givenCourse;
	}

	public String getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}
	
	
}
