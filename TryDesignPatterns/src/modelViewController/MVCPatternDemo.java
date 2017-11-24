package modelViewController;

/**
 * @author 张大爷
 * @time 2017年11月24日 下午5:04:33
 * @mail 767580776@qq.com
 * @automation
 */
public class MVCPatternDemo {
	private static Student infoFromDatabase() {
		Student student = new Student();
		student.setName("张大爷");
		student.setRollNo("001");
		return student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = infoFromDatabase();
		StudentView studentView = new StudentView();
		StudentController studentController = new StudentController(student, studentView);
		studentController.updateView();
		studentController.setStudentRollNo("002");
		studentController.updateView();

	}

}
