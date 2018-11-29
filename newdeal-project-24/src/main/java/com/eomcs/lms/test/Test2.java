package com.eomcs.lms.test;



public class Test2 {

  public static void main(String[] args) {
    Score s1 = new Score();
    
    s1.setName("Hong");
    s1.setKor(97);
    s1.setMath(97);
    s1.setEng(78);
    
    System.out.println(s1.getSum());
    System.out.println(s1.getAvr());

  }

}
