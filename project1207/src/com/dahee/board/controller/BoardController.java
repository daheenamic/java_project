package com.dahee.board.controller;

import com.dahee.board.service.BoardServiceImpl;
import com.dahee.main.Execute;
import com.dahee.main.Main;

public class BoardController {
	
	public void execute() {
		
		while (true) {
			
			System.out.println("\n<<<<<< 게시판 >>>>>>");
			System.out.println("1.리스트 2.보기 3.등록");
			System.out.println("4.수정 5.삭제 0.이전메뉴");
			System.out.print("메뉴 입력 -> ");
			String menu = Main.scanner.nextLine();
			
			switch (menu) {
			case "1" : // 게시판 리스트 처리
				Execute.run(new BoardServiceImpl(), null);
				break;
			case "2" : // 게시판 보기
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "3" : // 게시판 등록
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "4" : // 게시판 수정
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "5" : // 게시판 삭제
				//생성해서 호출할 수 있도록 전달한다.
				break;
			case "0" : // 이전메뉴
				//생성해서 호출할 수 있도록 전달한다.
				System.out.println("\n 이전메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("\n잘못된 메뉴를 선택하셨습니다.");
				System.out.println("1번~5번, 0번만 입력 하셔야 합니다.");
				break;
				
			} // end of switch
		} // end of while
	} // end of execute()
} // end of class
