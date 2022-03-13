package aggregationExample;

public class Student {
	
	private Teacher teacher;
	
	public Student() {
	}

	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
