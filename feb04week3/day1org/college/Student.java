package feb04week3.day1org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("Brindha");
	}
	public void studentDept() {
		System.out.println("MCA");
	}
	public void studentId() {
		System.out.println("1171117");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.studentName();
		student.studentDept();
		student.studentId();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
}
}