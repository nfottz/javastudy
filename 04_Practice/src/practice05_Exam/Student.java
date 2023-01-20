package practice05_Exam;

public class Student {

	// 필드
	private String name;
	private Exam exam;
	
	// 생성자
	public Student(String name) {
		this.name = name;
	}

	// 메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Exam getExam() {
		return exam;
	}
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	
	public void info() {
		System.out.println("학생명 : " + name);
		exam.examInfo();
	}
	
}
