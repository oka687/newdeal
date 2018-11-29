package com.eomcs.lms.test;

public class Patient {

  private String _name; //필드명: _name
  private int _age; //필드명: _age
  private int _weigt;
  private int _height;
  
  
  //setter/getter -> property라고 부른다.
  
  
  public String getName() { //프로퍼티명 name
    return _name;
  }
  public void setName(String name) { //프로퍼티명 name
    this._name = name;
  }
  public int getAge() {
    if(_weigt > 1 && _weigt < 200) {
      this._weigt = _weigt;
    }
    return _age;
  }
  public void setAge(int age) {
    this._age = age;
  }
  public int getWeight() {
    return _weigt;
  }
  public void setWeight(int weight) {
    this._weigt = weight;
  }
  public int getHeight() {
    return _height;
  }
  public void setHeight(int height) {
    this._height = height;
  }


}
