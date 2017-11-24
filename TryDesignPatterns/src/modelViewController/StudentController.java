package modelViewController;

/**
 * @author �Ŵ�ү
 * @time 2017��11��24�� ����4:19:36
 * @mail 767580776@qq.com
 * @automation
 */
public class StudentController {
	private Student student;
	private StudentView studentView;

	public StudentController(Student student, StudentView studentView) {
		// TODO Auto-generated constructor stub
		this.student = student;
		this.studentView = studentView;
	}

	public void setStudentName(String name) {
		student.setName(name);
	}

	public String getStudentName() {
		return student.getName();
	}

	public void setStudentRollNo(String rollNo) {
		student.setRollNo(rollNo);
	}

	public String getStudentRollNo() {
		return student.getRollNo();
	}

	public void updateView() {
		studentView.printStudentInfo(student.getName(), student.getRollNo());
	}
}
