package 보충1;

import java.util.Scanner;

public class Retest1_1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] memberArr = {"홍길동", "김성훈", "윤웅식", "윤성우", "남궁민"};

		System.out.print("검색할 회원 이름을 입력하세요 : ");

		String searchName = sc.next(); // sc.nextLine(); 13번째줄

		boolean result = false;

		for(int i=0 ; i<memberArr.length; i++){ // int i=0; i<memberArr.length; 17번째줄

			if(memberArr[i].equals(searchName)){ // if(memberArr[i].equals(searchName) 19번째줄
				result = true;
				break;
			}
		}
		if(!result){ // 25번째줄 !result여야함
			System.out.println("회원이 존재하지 않습니다.");
		} else {
			System.out.println("회원이 존재합니다");
		}	
	}
}






