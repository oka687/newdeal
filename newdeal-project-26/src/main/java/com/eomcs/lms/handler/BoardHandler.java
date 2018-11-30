package com.eomcs.lms.handler;
import java.sql.Date;
import java.util.Scanner;
import com.eomcs.lms.domain.Board;
<<<<<<< HEAD
=======
import com.eomcs.lms.util.ArrayList;
>>>>>>> work

public class BoardHandler {
  
  Scanner keyboard;
<<<<<<< HEAD
  BoardList list;
  
  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new BoardList(20);
  }
  
  public void listBoard() {
    Board[] boards = list.toArray();
    
    for (Board board : boards) {
=======
  ArrayList<Board> list;
  
  public BoardHandler(Scanner keyboard) {
    this.keyboard = keyboard;
    this.list = new ArrayList<>(20);
  }
  
  public void listBoard() {
    Board[] boards = new Board[list.size];
    list.toArray(boards);
    
    for (Board board : boards) {
       
//      Board board = (Board) obj; //오브젝트 배열을 보드 배열로 바꿀 수는 없다.
      //타입캐스팅은 원래 타입으로 바꾼다는 뜻이지, 애초에 다르면 캐스팅을 할 수 없다.
>>>>>>> work
      System.out.printf("%3d, %-20s, %s, %d\n", 
          board.getNo(), board.getContents(), 
          board.getCreatedDate(), board.getViewCount());
    }
  }

  public void addBoard() {
    Board board = new Board();
    
    System.out.print("번호? ");
    board.setNo(Integer.parseInt(keyboard.nextLine()));
    
    System.out.print("내용? ");
    board.setContents(keyboard.nextLine());
    
    board.setCreatedDate(new Date(System.currentTimeMillis())); 
    
    board.setViewCount(0);
    
    list.add(board);
    
    System.out.println("저장하였습니다.");
  }

}
