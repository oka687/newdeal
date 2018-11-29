package com.eomcs.lms.test;

public class Score {

  private String name;
  private int kor;
  private int math;
  private int eng;
  private int sum;
  private float avr;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getKor() {
    return kor;
  }
  public void setKor(int kor) {

    this.kor = kor;
  }
  public int getMath() {
    return math;
  }
  public void setMath(int math) {
    this.math = math;
  }
  public int getEng() {
    return eng;
  }
  public void setEng(int eng) {
    this.eng = eng;
  }
  public int getSum() {
    return sum;
  }
  public void setSum(int sum) {
    this.sum = sum;
  }
  public float getAvr() {
    return avr;
  }
  public void setAvr(float avr) {
    this.avr = avr;
  }
  
  private void compute() {
    
  }
  
}
