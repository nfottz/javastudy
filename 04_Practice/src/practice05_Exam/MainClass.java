package practice05_Exam;

public class MainClass {

	public static void main(String[] args) {
		
		Exam exam = new Exam("중간고사");
		exam.setScore();  // 국, 영, 수학 점수 0 ~ 100 사이 랜덤 생성
		
		Student student = new Student("emily");
		student.setExam(exam);
		student.info();
		
	}

}
