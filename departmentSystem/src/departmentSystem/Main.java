package departmentSystem;
import academic.Academician;
import course.Course;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Try 123");
//		System.out.println("Hello OOP");
		Academician academician = new Academician("151515", "Yusuf", "Yılmaz", Department.COMPUTERENGINEERING);
		try {
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());
			academician.addCourse(new Course());


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
