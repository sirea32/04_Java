package com.kh.test;

import java.util.ArrayList;
import com.kh.test.model.vo.Student;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
	}
}

/* 8번째줄 ArrayList<Student> list = null; 변수로 선언은 했지만 초기화가 안되어있어 출력을 시도하면 null관련 예외가 뜰것이다.
 * 해결방안은 null 대신 new ArrayList<>(); 써야 한다
 * 14번째줄 for(int i=0; i<list.length(); i++) {} 에서 list.length가 문제이다 현재 length 메서드가 없기 때문이다.
 * 해결방안은 list를 내용을 가져오기위해서는 .size() 메서드를 사용해야한다.
 * for(int i=0; i<list.size(); i++) {}
 * 
 * 
 */