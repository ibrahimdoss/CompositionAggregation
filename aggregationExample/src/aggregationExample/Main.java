package aggregationExample;

public class Main {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher("ibrahim dos");
		
		Student student = new Student(teacher);
		
		System.out.println("Teacher :" + student.getTeacher().getName());
		student = null;
		
		System.out.println("Student nesnesi silindikten sonra : " + teacher);
	}
}
