package xmlBasedInjection;

public class Student {

	String studentName;
	
	int studentAge;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
}
