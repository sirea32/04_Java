package student.run;

import student.view.StudentView;

// 실행용 클래스
public class StudentRun {

	public static void main(String[] args) {
		

		// StudentView 객체 생성
		StudentView view = new StudentView();
		view.mainMenu();
		
	}
}
// 해석을 할때 Run부터 해석시작 그다음 View 그다음 Service 그다음 DTO 순으로 해석
// 런이 뷰객체 생성 뷰객체가 서비스객체 생성 서비스 객체가 DTO[] 생성
// Student복습에 런 뷰 서비스 DTO[] 만들어가면서 복습해보기