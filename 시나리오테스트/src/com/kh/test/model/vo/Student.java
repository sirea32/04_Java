package com.kh.test.model.vo;

public class Student {
	private String name;
	private int score;
	
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " 학생의 점수 : " + score + "점";
	}
}
/*	24번째줄에 return super.toString(); 이 문제이다. 원하는 출력결과는 name + " 학생의 점수 : " + score + "점" 이기 때문에 저대로 뒀을경우 원하는 결과창이 출력되지 않을것이다.
 *  해결방안은 return name + " 학생의 점수 : " + score + "점"; 으로 수정해야한다.
 *  7번째줄에 public Student() {} 문제이다. Test클래스에서 가져갈때 매개변수를 받는 생성자가 없다면 문제가 발생할것이다. 출력시 null 이나 0 이름과 점수대신 출력되거나 출력이 안될것이다.
 *  해결방안으로는 생성자 오버로딩으로 이름과 점수를 받는 생성자를 추가한다.
 *      public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
 */