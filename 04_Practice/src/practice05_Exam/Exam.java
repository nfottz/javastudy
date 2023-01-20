package practice05_Exam;

public class Exam {
	
	// 필드
	private String examName;
	private int kor;
	private int eng;
	private int mat;
	
	// 생성자
	public Exam(String examName) {
		this.examName = examName;
	}
	
	// 메소드
	public void setScore() {
		// 모든 점수를 0 ~ 100 사이로 랜덤하게 세팅
		kor = (int)(Math.random() * 101);
		eng = (int)(Math.random() * 101);
		mat = (int)(Math.random() * 101);
	}
	
	public void examInfo() {
		System.out.println(examName + " 성적");
		System.out.println("국어:" + kor + ",영어:" + eng + ",수학:" + mat);
		int total = kor + eng + mat;
		System.out.println("총점:" + total + ",평균:" + (total / 3.0));
	}
	
}
