package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;

public class BoardHandler {
  //목적 : 여기는 입력만 받게 해라.

  
  Scanner keyboard;//스캐너
  BoardList list = new BoardList();
 
  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard; //키보드를 받기 위한 생성자
    //this.list = new BoardList(20);//보드리스트로부터 저장한 값을 받기 위해 필요한 생성자
  }
  

  public void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));//번호를 입력받는 로직 board에 저장하는 로직
    
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());//내용을 입력받아서 board에 저장하는 로직
    
    board.setCreatedDate(new Date(System.currentTimeMillis())); //내용이 입력된 시간
    
    board.setViewCount(0);//조회수카운팅
    

    
    list.add(board);
    
    System.out.println("저장하였습니다.");
  }

}
