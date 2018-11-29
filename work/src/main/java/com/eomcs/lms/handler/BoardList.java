package com.eomcs.lms.handler;

import java.sql.Date;
import com.eomcs.lms.domain.Board;

public class BoardList {
  
  static final int LENGTH = 10;
  Board[] boards; //domain보드를 바탕으로 배열을 생성
  int boardIdx = 0;//보드 개수 카운팅

  
  //전달 받은 것. 번호와 내용. 여기서 해야 할 것은 받은 내용을 배열에 저장하는 것.
  //필요한 것. 저장할 배열, 저장한 번호, 저장순서 로직
 //보드의 수는 10개로 고정 돼 있다.
  
  public BoardList() {
    boards = new Board[LENGTH];
  }//최대 배열을 초기화
  
  
  //현재 없는 것 -> board 내역을 받아서 저장하는 것
  public void add(Board board) {
  
    this.boards[this.boardIdx] = board; //몇 번 보드인지 카운팅 해서 위에서 받은 내용을 저장
    this.boardIdx++;//보드의 개수를 카운팅
    
  }

  
  public void listBoard() {
    
    for (int j = 0; j < boardIdx; j++) {
      System.out.printf("%3d, %-20s, %s, %d\n", 
          this.boards[j].getNo(),
          this.boards[j].getContents(),
          this.boards[j].getCreatedDate(), 
          this.boards[j].getViewCount());
    }//보드의 리스트를 띄우는 로직
   
    
  }
  
  
  
  
 
}
